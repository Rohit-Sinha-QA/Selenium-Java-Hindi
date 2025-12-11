package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTest {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rohit-automation.netlify.app/");
    }
}
