package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.IOException;

public class ScreenshotTest extends BaseTest {

    @Test
    public void testScreenshot() throws IOException {
        ActionHelper action = new ActionHelper(driver);
        action.type(By.id("idtextbox1"), "Rohit");
        action.click(By.id("idradiobutton1"));
        action.click(By.id("idcheckbox1"));
        action.takeScreenshot("demoScreenshot");
    }
}
