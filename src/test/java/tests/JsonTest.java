package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.JsonUtils;

public class JsonTest extends BaseTest {
    @Test
    public void testJsondata(){
        ActionHelper action = new ActionHelper(driver);
        action.type(By.id("idtextbox1"), JsonUtils.get("text2"));;
    }
}
