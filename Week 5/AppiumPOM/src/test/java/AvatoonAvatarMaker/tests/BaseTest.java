package AvatoonAvatarMaker.tests;

import AvatoonAvatarMaker.utils.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriverWait wait;

    @BeforeClass
    public void setUp() {

        //Driver.get().get("http://127.0.0.1:4723/wd/hub");
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(Driver.get(), 20);

    }

//    @AfterAll
//    public static void tearDown() throws MalformedURLException {
//        Driver.get().removeApp("face.cartoon.picture.editor.emoji");
//    }
}
