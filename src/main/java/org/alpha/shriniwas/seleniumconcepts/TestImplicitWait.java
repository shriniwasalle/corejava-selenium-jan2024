package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestImplicitWait extends BaseTest {

    WebDriver driver;

    public void visibilityOfElementLocated(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20); // 500 millisec
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

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

        visibilityOfElementLocated(By.xpath("//a[@title='Cart'][2]"));

        WebElement element = driver.findElement(By.xpath("//a[@title='Cart'][2]"));
        element.click();

        visibilityOfElementLocated(By.xpath("//a[@title='ABCD'][2]"));

        driver.findElement(By.xpath("//a[@title='ABCD'][2]")).click();
    }

    @Test
    public void verifyFluentWait() {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(20)); // 1000 ms = 1 sec
        fluentWait.pollingEvery(Duration.ofSeconds(2));
        fluentWait.ignoring(NoSuchElementException.class);

        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Cart'][2]")));

        driver.findElement(By.xpath("//a[@title='Cart'][2]")).click();
    }

}
