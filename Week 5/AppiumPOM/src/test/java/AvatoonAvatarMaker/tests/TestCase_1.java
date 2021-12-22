package AvatoonAvatarMaker.tests;

import AvatoonAvatarMaker.pages.CreatePage;
import AvatoonAvatarMaker.pages.HomePage;
import AvatoonAvatarMaker.pages.SaveToPage;
import AvatoonAvatarMaker.pages.SplashScreen;
import org.testng.annotations.Test;


public class TestCase_1 extends BaseTest {

    @Test(priority = 0)
    public void createAvatarBoy() {
        CreatePage createPage = new CreatePage();
        SplashScreen splashScreen = new SplashScreen();

        splashScreen.skip();
        createPage.chooseGender("boy");
        createPage.manualEdit();
        createPage.chooseFace();
        createPage.chooseHair();
        createPage.chooseEye();
        createPage.chooseBeard();
        createPage.clickNotifications();
    }

    @Test(priority = 1)
    public void saveToGallery() throws InterruptedException {
        HomePage homePage = new HomePage();
        SaveToPage saveToPage = new SaveToPage();

        homePage.goToSave();
        saveToPage.choosePoseType();
        saveToPage.saveToGallery();
        saveToPage.verifySave();
        homePage.removeApp();
    }

}
