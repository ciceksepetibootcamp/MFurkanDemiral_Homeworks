package CicekSepeti.tests;

import CicekSepeti.utils.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;

import java.time.Duration;

public class BaseTest {
    @Before
    public void setup() {
        Driver.get().get("https://www.ciceksepeti.com/");
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.get().manage().window().maximize();
        try {
            Driver.get().switchTo().frame(Driver.get().findElement(By.className("ab-modal-interactions")));
            Driver.get().findElement(By.className("close-icon")).click();
            Driver.get().switchTo().defaultContent();
        }
        catch(Exception e) {
            System.out.println("Kampanya popupı yok.");
        }

        Driver.get().findElement(By.className("js-subheader-close")).click();
        Driver.get().findElement(By.className("js-policy-close")).click();
    }

    @After
    public void teardown() {
        Driver.closeDriver();
    }
}
