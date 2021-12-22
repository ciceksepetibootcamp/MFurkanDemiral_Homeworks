package AvatoonAvatarMaker.pages;

import AvatoonAvatarMaker.utils.Driver;
import org.openqa.selenium.support.PageFactory;

import static AvatoonAvatarMaker.utils.Locators.*;

public class SplashScreen {

    public SplashScreen() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void skip() {
        Driver.get().findElement(NEXT).click();
        Driver.get().findElement(NEXT).click();
        Driver.get().findElement(NEXT).click();
        Driver.get().findElement(CLOSE_BUTTON).click();
    }
}
