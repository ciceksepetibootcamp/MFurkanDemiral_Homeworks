package AvatoonAvatarMaker.tests;

import AvatoonAvatarMaker.pages.CreatePage;
import AvatoonAvatarMaker.pages.HomePage;
import AvatoonAvatarMaker.pages.SaveToPage;
import AvatoonAvatarMaker.pages.SplashScreen;
import AvatoonAvatarMaker.utils.Driver;
import org.testng.annotations.Test;

public class TestCase_2 extends BaseTest {


    @Test(priority = 2)
    public void createAvatarGirl() {
        CreatePage createPage = new CreatePage();
        Driver.get().launchApp();
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.skip();
        createPage.chooseGender("girl");
        createPage.manualEdit();
        createPage.chooseFace();
        createPage.chooseHair();
        createPage.chooseEye();
        createPage.clickNotifications();
    }

    @Test(priority = 3)
    public void saveToGallery() throws InterruptedException {
        HomePage homePage = new HomePage();
        SaveToPage saveToPage = new SaveToPage();

        homePage.goToSave();
        saveToPage.choosePoseType();
        saveToPage.saveToGallery();
        saveToPage.verifySave();

    }
}
