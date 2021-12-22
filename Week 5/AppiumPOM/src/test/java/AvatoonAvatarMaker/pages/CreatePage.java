package AvatoonAvatarMaker.pages;

import AvatoonAvatarMaker.utils.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static AvatoonAvatarMaker.utils.Locators.*;

public class CreatePage {
    WebDriverWait wait = new WebDriverWait(Driver.get(), 20);

    public CreatePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void chooseGender(String gender) {
        switch (gender) {
            case "boy":
                Driver.get().findElement(BOY).click();
                break;
            case "girl":
                Driver.get().findElement(GIRL).click();
                break;
        }
    }

    public void manualEdit() {
        Driver.get().findElement(MANUAL_EDIT).click();
    }

    public void chooseFace() {
        wait.until(ExpectedConditions.presenceOfElementLocated(FACE_TYPE)).click();
    }

    public void chooseHair() {
        Driver.get().findElement(HAIR_MENU).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(HAIR_TYPE)).click();
        Driver.get().findElement(HAIR_COLOR).click();
    }

    public void chooseEye() {
        Driver.get().findElement(EYE_MENU).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(EYE_TYPE)).click();
    }

    public void chooseBeard() {
        Driver.get().findElement(BEARD_MENU).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(BEARD_TYPE)).click();
    }

    public void clickNotifications() {
        Driver.get().findElement(SAVE).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(CLAIM)).click();
        Driver.get().findElement(NOTIFICATION_NEXT).click();
        Driver.get().findElement(NOTIFICATION_NEXT).click();
        Driver.get().findElement(NOTIFICATION_NEXT).click();
        Driver.get().findElement(NOTIFICATION_NEXT).click();
        Driver.get().findElement(CLICK_SCREEN).click();
    }
}
