package org.alpha.tejashri.selenium.concepts.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestFluentWait {
    @Test
    public void verifyFluentWait() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        driver.manage().window().maximize();

        //Fluent Wait added
        //Fluent wait applicable for particular web element only
        //Declare & Initialise a FluentWait
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(20));//In Seconds, ofMillis(20000)//In milli seconds, ofMinutes(1)//In Minutes
        fluentWait.pollingEvery(Duration.ofSeconds(2));
        fluentWait.ignoring(Exception.class);

        //Or use
        //create the object of Wait with the reference og FluentWait
//        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(20)) //Specify the timeout of the wait
//                .pollingEvery(Duration.ofSeconds(2)) //specify polling time
//                .ignoring(Exception.class);  //Specify what Exception to ignore

        //To Sign in to Account
        //with storing in another variable
        WebElement texEmail = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        texEmail.sendKeys("abcxyz@example.com");//Enter Email

        //without storing in another variable
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("abc123xyz");//Enter password

        fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();

        //driver.close();
    }
}
