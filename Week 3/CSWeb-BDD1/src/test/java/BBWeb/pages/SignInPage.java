package BBWeb.pages;

import BBWeb.utils.ConfReader;
import BBWeb.utils.Drivers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Drivers.get(), this);
    }

    @FindBy(id = "fld-e")
    public WebElement emailField;

    public void fillEmail() {
        String email = ConfReader.get("email");
        emailField.sendKeys(email);
    }

    @FindBy(id = "fld-p1")
    public WebElement passwordField;

    public void fillPassword() {
        String password = ConfReader.get("password");
        passwordField.sendKeys(password);
    }

    public void login() {
        passwordField.click();
        passwordField.sendKeys(Keys.ENTER);
    }

    @FindBy(css = ".plButton-label.v-ellipsis")
    public WebElement helloText;

    public void verifyLogin(String arg0) {
        Assert.assertTrue(helloText.getText().toLowerCase().contains(arg0.toLowerCase()));
    }

    public void fillWrongEmail() {
        String wrongEmail = ConfReader.get("wrong-email");
        emailField.sendKeys(wrongEmail);
    }

    public void fillWrongPassword() {
        String wrongPassword = ConfReader.get("wrong-password");
        passwordField.sendKeys(wrongPassword);
    }

    @FindBy(className = "c-alert-content")
    public WebElement errorMessage;
    public void verifyWrongLogin(String arg0) {
        String actual = errorMessage.getText().toLowerCase();
        String expected = arg0.toLowerCase();
        Assert.assertTrue(actual.contains(expected));
    }
}
