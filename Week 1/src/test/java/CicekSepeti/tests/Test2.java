package CicekSepeti.tests;

import CicekSepeti.utils.ConfReader;
import CicekSepeti.utils.Driver;
import org.junit.*;
import org.openqa.selenium.By;


public class Test2 extends BaseTest{

    @Test
    public void login() {
        Driver.get().findElement(By.cssSelector(".user-menu__item:nth-child(2)")).click();
        Driver.get().findElement(By.className("users-process-list__btn")).click();
        Driver.get().findElement(By.id("EmailLogin")).sendKeys(ConfReader.get("email"));
        Driver.get().findElement(By.id("Password")).sendKeys(ConfReader.get("password"));
        Driver.get().findElement(By.className("login__btn")).click();

    }

    @Test
    public void favoriUrunKontrol() throws InterruptedException {
        login();
        Thread.sleep(2000);
        Driver.get().findElement(By.className("js-product-search-input")).sendKeys("oyuncak");
        Driver.get().findElement(By.className("product-search__button")).click();
        Driver.get().findElement(By.cssSelector(".products__item:nth-child(3)")).click();
        String productName = Driver.get().findElement(By.className("js-ellipsize-text")).getText();
        Driver.get().findElement(By.className("js-favorite-add")).click();
        Driver.get().findElement(By.className("user-menu__link--favorite")).click();
        String favProductName = Driver.get().findElement(By.className("products__item-title")).getText();
        Driver.get().findElement(By.className("add-favorite")).click();
        Assert.assertEquals(productName,favProductName);
    }

}
