package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TagsTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void testtagsTest1(){
        driver.findElement(By.id("idtextbox1")).sendKeys("SMOKE");
    }

    @Test(groups = {"regression"})
    public void testtagsTest2(){
        driver.findElement(By.id("idtextbox1")).sendKeys("REGRESSION");
    }

    @Test(groups = {"smoke", "regression"})
    public void testtagsTest3(){
        driver.findElement(By.id("idtextbox1")).sendKeys("SMOKE & REGRESSION");
    }
}
