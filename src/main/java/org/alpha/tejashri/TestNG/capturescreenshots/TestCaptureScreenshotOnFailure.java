package org.alpha.tejashri.TestNG.capturescreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class TestCaptureScreenshotOnFailure extends BaseClass {

    @Test
    public void verifyLogin() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce123");
        driver.findElement(By.id("login-button")).click();

        String actualHeading = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
        String expectedHeading = "Products";

        Assert.assertEquals(actualHeading, expectedHeading);
    }

    @Test
    public void signUp() {
        Assert.assertEquals("Shri", "Shri123");
    }

}
