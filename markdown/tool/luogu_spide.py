from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import ElementClickInterceptedException, TimeoutException
import time
import pyperclip

data = []
chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument("--start-maximized")
prefs = {
    "profile.default_content_setting_values.clipboard": 1  # 1=允许，2=禁止
}
chrome_options.add_experimental_option("prefs", prefs)
try:
    driver = webdriver.Chrome(options=chrome_options)
except Exception as e:
    print("无法启动Chrome浏览器，请确保已安装Google Chrome浏览器")
    print(f"错误详情: {e}")

def crawl_dynamic_content(url):
    try:
    
        driver.get(url)
        WebDriverWait(driver, 10).until(
            EC.presence_of_element_located((By.TAG_NAME, "body"))
        )
        time.sleep(3)
        problem_elements = driver.find_elements(By.XPATH, '''//*[@id="app"]/div[3]/main/div/div/div/div[2]/div/div[1]/div[2]/div''')
        len_problem_elements = len(problem_elements)
        print(f"找到 {len_problem_elements} 个题目元素")

        for i in range(len_problem_elements):
            data.append([])
            try:
                problem_link = problem_elements[i].find_element(By.XPATH, ".//div[2]/a")
                problem_title = problem_link.text
                problem_href = problem_link.get_attribute("href")
                data[i].append(problem_title)
                print(f"找到题目: {problem_title}")

                driver.execute_script("window.open(arguments[0]);", problem_href)
                driver.switch_to.window(driver.window_handles[1])
                WebDriverWait(driver, 10).until(
                    EC.presence_of_element_located((By.TAG_NAME, "body"))
                )

                
                # 获取题目内容
                problem_content = ""
                try:
                    problem_copy = WebDriverWait(driver, 10).until(
                        EC.element_to_be_clickable((By.XPATH, "//a[contains(., '复制 Markdown')]") )
                    )
                    driver.execute_script("arguments[0].scrollIntoView();", problem_copy)
                    driver.execute_script("arguments[0].click();", problem_copy)
                    time.sleep(1)
                    problem_content = pyperclip.paste()
                except Exception as e:
                    print(f"复制题目内容失败: {e}")
                data[i].append(problem_content)

                # 遍历 field 提取时间限制和内存限制
                fields = driver.find_elements(By.CSS_SELECTOR, 'div.field')
                time_limit = memory_limit = ""
                for field in fields:
                    spans = field.find_elements(By.TAG_NAME, 'span')
                    if len(spans) >= 2:
                        if '时间限制' in spans[0].text:
                            time_limit = spans[1].text
                        if '内存限制' in spans[0].text:
                            memory_limit = spans[1].text

                # 提取所有标签文本
                tags = [span.text for span in driver.find_elements(By.CSS_SELECTOR, 'div.tags span')]
                data[i].extend([time_limit, memory_limit, tags])

                driver.close()
                driver.switch_to.window(driver.window_handles[0])
                time.sleep(2)
            except Exception as e:
                print(f"处理题目时出错: {e}")
                if len(driver.window_handles) > 1:
                    driver.close()
                    driver.switch_to.window(driver.window_handles[0])
                continue
    except Exception as e:
        print(f"爬取过程出错：{e}")
    finally:
        driver.quit()

if __name__ == "__main__":
    driver.get("https://www.luogu.com.cn/")
    input("请在弹出的浏览器中手动登录洛谷账号，登录完成后按回车继续...")
    target_url = "https://www.luogu.com.cn/problem/list?type=all&keyword=%E6%A8%A1%E6%9D%BF&page="
    for i in range(1, 7):
        crawl_dynamic_content(target_url+str(i))
    print("爬取的数据：", data)