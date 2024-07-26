package org.alpha.sanjeevani.testngconcepts.screenshotonfailure;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaptureScreenshotOnFailure extends BaseClass {
    @Test
    public void verifyLogin(){

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce123");
        driver.findElement(By.id("login-button")).click();

       String actualHeading = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
       String expectedHeading = "Products";

       Assert.assertEquals(actualHeading, expectedHeading);
   }
}
