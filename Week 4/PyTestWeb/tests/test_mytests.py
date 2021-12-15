from pages.category_page import CategoryPage
from pages.home_page import HomePage
from tests.base_test import BaseTest


class TestMyTest(BaseTest):

    def test_my_tests(self):
        home_page = HomePage(self.driver)
        category_page = CategoryPage(self.driver)

        home_page.close_notificiations()
        home_page.close_cookie()
        home_page.choose_menu('KATEGORİLER')
        home_page.choose_menu_item('Yazılım')

        search_result = category_page.check_page_loaded()
        self.assertIn('Yazılım', search_result)
        category_page.filter_time_line('VİDEO')
        url = category_page.verify_url()
        self.assertTrue('video' in url)


