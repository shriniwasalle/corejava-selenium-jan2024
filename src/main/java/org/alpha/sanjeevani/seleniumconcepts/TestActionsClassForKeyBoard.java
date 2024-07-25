package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestActionsClassForKeyBoard extends BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }
    @Test
    public void verifyMouseOver(){
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.id("user-name"));
        actions.keyDown(element, Keys.SHIFT).sendKeys("sanjeevani").keyUp(Keys.SHIFT).perform();
        actions.doubleClick().perform();
        }
}
