from selenium.webdriver.common.by import By


class HomePageLocators(object):
    NOTIFICATION = (By.ID, 'onesignal-slidedown-cancel-button')
    COOKIE = (By.LINK_TEXT, 'ANLADIM')


class CategoryPageLocators(object):
    RESULT = (By.TAG_NAME, 'h1')
    FILTER = (By.ID, 'timeline-filter')
