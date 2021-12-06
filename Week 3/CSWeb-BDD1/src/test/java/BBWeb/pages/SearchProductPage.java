package BBWeb.pages;

import BBWeb.utils.Drivers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {
    public SearchProductPage() {
        PageFactory.initElements(Drivers.get(), this);
    }


    @FindBy(tagName = "h1")
    public WebElement searchResult;

    public void verifySearchResult(String arg0) {
        String result = searchResult.getText().toLowerCase();
        Assert.assertTrue(result.contains(arg0.toLowerCase()));
    }



}
