package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Dashboard;

public class POMTest extends BaseTest {

    @Test
    public void testPOMTest(){
        Dashboard pom = new Dashboard(driver);

        pom.typeInInputBox();
        pom.clickOnRadioButton();
        pom.clickOnCheckBox();
    }
}
