package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestImplicitWait extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = initBrowser("https://www.flipkart.com/", "chrome");
    }

    @Test
    public void verifyImplicitWait() {

        WebElement element = driver.findElement(By.xpath("//a[@title='Cart1234'][2]"));
        element.click();

        driver.findElement(By.xpath("//div[@tiutle='xyz']"));
    }

    @Test
    public void verifyExplicitWait() {

        visibilityOfElement(By.xpath("//a[@title='Cart'][2]"));

        WebElement element = driver.findElement(By.xpath("//a[@title='Cart'][2]"));
        element.click();

        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='ABCD'][2]")));

        driver.findElement(By.xpath("//a[@title='ABCD'][2]"));
    }

    public void visibilityOfElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
