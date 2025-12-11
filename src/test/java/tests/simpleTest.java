package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class simpleTest extends BaseTest {

    @Test
    public void testSimpleTestDemo(){
        driver.findElement(By.id("idtextbox1")).sendKeys("Rohit");
        driver.findElement(By.id("idradiobutton1")).click();
        driver.findElement(By.id("idcheckbox1")).click();
    }
}
