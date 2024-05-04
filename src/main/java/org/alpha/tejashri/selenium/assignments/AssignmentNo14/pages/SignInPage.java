package org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class SignInPage {

    private final WebDriver driver;
    private final By linkSingIn = By.linkText("Sign In");
    private final By txtEmail = By.id("email");
    private final By txtPassword = By.id("pass");
    private final By btnSingIn = By.id("send2");

    //created parametrised constructor
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifySignInPage() throws InterruptedException {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Home Page
        driver.findElement(linkSingIn).click();

        //SignIn Page
        driver.findElement(txtEmail).sendKeys("abc123xyz@example.com");
        driver.findElement(txtPassword).sendKeys("abcxyz@123");
        driver.findElement(btnSingIn).click();

    }
}
