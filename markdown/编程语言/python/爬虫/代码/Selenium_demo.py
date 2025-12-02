from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

# 创建一个 Chrome 的 WebDriver 实例
driver = webdriver.Chrome()

try:
    # 打开百度首页
    driver.get("http://www.baidu.com")

    # 等待页面加载完成
    driver.implicitly_wait(5)

    # 找到搜索框元素，这里我们使用 CSS 选择器
    search_box = driver.find_element(By.CSS_SELECTOR, "input[name='wd']")

    # 输入搜索内容并提交
    search_box.send_keys("Selenium")
    search_box.send_keys(Keys.RETURN)

    # 等待搜索结果页面加载完成
    driver.implicitly_wait(5)

    # 打印页面标题
    print("Page title is:", driver.title)

finally:
    # 关闭浏览器
    driver.quit()