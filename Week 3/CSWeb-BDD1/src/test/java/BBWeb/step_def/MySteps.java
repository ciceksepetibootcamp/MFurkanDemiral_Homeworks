package BBWeb.step_def;

import BBWeb.pages.HomePage;
import BBWeb.pages.SearchProductPage;
import BBWeb.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    SearchProductPage searchProductPage = new SearchProductPage();

    @Given("Homepage is open")
    public void homepageIsOpen() {
        homePage.chooseUS();
    }

    @When("Popup close")
    public void popupClose() {
        homePage.closePopup();
    }

    @Given("Verify Page Title with {string}")
    public void verifyPageTitleWith(String arg0) {
        homePage.verifyPageTitle(arg0);
    }

    @And("Search for {string}")
    public void searchFor(String arg0) {
        homePage.search(arg0);
        homePage.searchBtn();
    }

    @Then("Verify search results are listed for {string}")
    public void verifySearchResultsAreListedFor(String arg0) {
        searchProductPage.verifySearchResult(arg0);
    }

    @Given("Go to Sign In page")
    public void goToSignInPage() {
        homePage.goToSignInPage();
    }

    @And("Fill email")
    public void fillEmailWith() {
        signInPage.fillEmail();
    }

    @And("Fill password")
    public void fillPasswordWith() {
        signInPage.fillPassword();
    }

    @Then("Login with Enter button")
    public void loginWithEnterButton() {
        signInPage.login();
    }

    @And("Verify Succesful Login with {string}")
    public void verifySuccesfulLoginWith(String arg0) {
        signInPage.verifyLogin(arg0);
    }


    @And("Fill wrong email")
    public void fillWrongEmail() {
        signInPage.fillWrongEmail();
    }

    @And("Fill wrong password")
    public void fillWrongPassword() {
        signInPage.fillWrongPassword();
    }

    @And("Verify Wrong Login with {string}")
    public void verifyWrongLoginWith(String arg0) {
        signInPage.verifyWrongLogin(arg0);
    }
}
