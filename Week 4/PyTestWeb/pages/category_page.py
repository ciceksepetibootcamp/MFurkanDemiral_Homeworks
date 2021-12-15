from selenium.webdriver.support.select import Select
from pages.base_page import BasePage
from utils.locators import CategoryPageLocators


class CategoryPage(BasePage):
    def __init__(self, driver):
        self.locator = CategoryPageLocators
        super().__init__(driver)  # Python3 version

    def check_page_loaded(self):
        return self.find_element(*self.locator.RESULT).text


    def filter_time_line(self, filter_text):
        item = Select(self.find_element(*self.locator.FILTER))
        item.select_by_visible_text(filter_text)

    def verify_url(self):
        return self.get_url()



