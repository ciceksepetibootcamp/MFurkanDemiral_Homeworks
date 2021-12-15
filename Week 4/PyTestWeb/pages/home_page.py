from selenium.webdriver.common.by import By

from pages.base_page import BasePage
from utils.locators import HomePageLocators


class HomePage(BasePage):
    def __init__(self, driver):
        self.locator = HomePageLocators
        super().__init__(driver)  # Python3 version

    def close_notificiations(self):
        self.find_element(*self.locator.NOTIFICATION).click()

    def close_cookie(self):
        self.find_element(*self.locator.COOKIE).click()

    def choose_menu(self, menu):
        self.wait_element(By.LINK_TEXT, menu)
        self.find_element(By.LINK_TEXT, menu).click()

    def choose_menu_item(self, menu_item):
        self.wait_element(By.LINK_TEXT, menu_item)
        self.find_element(By.LINK_TEXT, menu_item).click()
