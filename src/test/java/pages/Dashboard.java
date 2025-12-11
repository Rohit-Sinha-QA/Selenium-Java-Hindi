package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

    WebDriver driver;

    public Dashboard(WebDriver driver){
        this.driver = driver;
    }

    By inputBox =By.id("idtextbox1");
    By radioButton =By.id("idradiobutton1");
    By checkBox =By.id("idcheckbox1");

    public void typeInInputBox(){
        driver.findElement(inputBox).sendKeys("ABCDEF");
    }

    public void clickOnRadioButton(){
        driver.findElement(radioButton).click();
    }

    public void clickOnCheckBox(){
        driver.findElement(checkBox).click();
    }
}
