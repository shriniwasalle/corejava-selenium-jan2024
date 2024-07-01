package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ActionsClassForMouseOver extends BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://www.flipkart.com/", "chrome");
    }
    @Test
    public void verifyMouseOver(){
            WebElement element=driver.findElement(By.xpath("//img[@alt='Dropdown with more help links']"));
            Actions actions=new Actions(driver);
            actions.moveToElement(element).perform();
        }
}
