package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActionHelperTest extends BaseTest {
    @Test
    public void testActionHelperDemo(){
        ActionHelper action = new ActionHelper(driver);
        action.type(By.id("idtextbox1"), "Rohit");
        action.click(By.id("idradiobutton1"));
        action.click(By.id("idcheckbox1"));
    }
}
