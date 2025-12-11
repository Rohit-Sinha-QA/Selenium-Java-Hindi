package actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ActionHelper {

    WebDriver driver;

    public ActionHelper(WebDriver driver){
        this.driver = driver;
    }

    public void type(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void takeScreenshot(String fileName) throws IOException {
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File targetFile = new File(".//src/test/java/screenshots/" + fileName + ".png");
        FileUtils.copyFile(sourceFile, targetFile);
    }
}
