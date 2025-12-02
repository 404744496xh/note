from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import pymysql
import time

# 把其他类型的课程也爬下来

try:
    # 初始化webdriver（这里以Chrome为例）
    driver = webdriver.Chrome()

    # 打开目标网页
    temp = driver.get('https://www.icourse163.org/channel/3002.htm?cate=1001056001&subCate=-1')

    for i in range(3, 9):
        # 翻页下一个类别
        next_category = driver.find_element(By.XPATH, f'//*[@id="channel-category-nav"]/div/div/span[{i}]')
        category_name = next_category.text
        print(category_name)
        next_category.click()
        time.sleep(2)

        # 连接数据库，操作数据库
        conn = pymysql.connect(host='localhost', user='root', password='123', db='icoursedb')
        cursor = conn.cursor()

        # 定位翻页按钮）
        next_page_button = None

        while True:
            # 等待页面加载完成，确保可以获取课程列表
            WebDriverWait(driver, 10).until(
                EC.visibility_of_all_elements_located(
                    (By.XPATH, '//*[@id="channel-course-list"]/div/div/div[2]/div[1]/div'))
            )

            # 获取课程列表
            icourseItems = driver.find_elements(By.XPATH, '//*[@id="channel-course-list"]/div/div/div[2]/div[1]/div')
            temp = len(driver.find_elements(By.XPATH, '//*[@id="channel-course-list"]/div/div/div[2]/div[2]/div/a'))

            # 重新定位翻页按钮，以防页面结构变化导致原定位失效
            if temp != 0:
                next_page_button = driver.find_element(By.XPATH,f'//*[@id="channel-course-list"]/div/div/div[2]/div[2]/div/a[{temp}]')

            # 遍历课程列表
            for icourseItem in icourseItems:
                # 课程名
                course_name = icourseItem.find_element(By.XPATH, 'div/div[3]/div[1]/h3').text
                print(course_name)
                # 大学
                college = icourseItem.find_element(By.XPATH, 'div/div[3]/div[1]/p').text
                print(college)
                # 授课教师
                teacher = icourseItem.find_element(By.XPATH, 'div/div[3]/div[1]/div').text
                print(teacher)
                # 参与人数
                participants = int(icourseItem.find_element(By.XPATH, 'div/div[3]/div[2]/span').text[:-3])
                print(participants)
                # 进行至第几周
                week = icourseItem.find_element(By.XPATH, 'div/div[3]/div[2]/div').text
                print(week)
                # 将采集的数据添加到MySql数据库
                # 检查课程是否存在
                check_sql = "SELECT * FROM computer_course WHERE course_name=%s AND college=%s"
                cursor.execute(check_sql, (course_name, college))
                course_exists = cursor.fetchone()

                if course_exists:
                    # 如果存在，更新数据
                    update_sql = """
                    UPDATE computer_course
                    SET teacher=%s, participants=%s, week=%s, category=%s
                    WHERE course_name=%s AND college=%s
                    """
                    update_data = (teacher, participants, week, category_name, course_name, college)
                else:
                    # 如果不存在，插入新数据
                    insert_sql = "INSERT INTO computer_course (course_name, college, teacher, participants, week, category) VALUES (%s, %s, %s, %s, %s, %s)"
                    insert_data = (course_name, college, teacher, participants, week, category_name)

                # 执行SQL语句
                cursor.execute(update_sql if course_exists else insert_sql, update_data if course_exists else insert_data)
                # 提交事务
                conn.commit()
            if temp == 0:
                break

            next_page_button_classes = next_page_button.get_attribute('class')

            # 假设当到达最后一页时，'next-page-button' 类会包含一个 'disabled' 类
            if '_3YiUU _1BSqy' in next_page_button_classes:
                break  # 到达最后一页，退出循环

            # 点击翻页按钮
            next_page_button.click()
            time.sleep(2)
            # 等待页面加载完成，可以通过检测翻页按钮的状态、新出现的元素或其他条件来判断
            WebDriverWait(driver, 10)

except Exception as e:
    print(f"An error occurred: {e}")
finally:
    # 关闭数据库连接
    conn.close()
    # 关闭浏览器
    driver.quit()
