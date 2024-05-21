package org.alpha.darshan.assignments.pom1.test;

import org.alpha.darshan.assignments.pom1.pages.LogInPage;
import org.alpha.darshan.assignments.pom1.pages.productsPage;
import org.alpha.darshan.assignments.pom1.test.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPageTest extends BaseTest {

    WebDriver driver;
    @BeforeMethod
    public void init(){
       driver= browserInit("https://www.saucedemo.com/","chrome");
    }

    @AfterMethod
    public void browserClose(){
        driver.close();
    }

    @Test
    public void verifyLogIn(){

      LogInPage login=new LogInPage(driver);
      login.logInToApplication("standard_user","secret_sauce");
      productsPage productsPage= new productsPage(driver);
     String actualTitle= productsPage.verifyTitle();
     String expectedTitle="Products";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
