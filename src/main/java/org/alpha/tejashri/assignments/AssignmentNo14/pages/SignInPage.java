package org.alpha.tejashri.assignments.AssignmentNo14.pages;

import org.alpha.tejashri.assignments.AssignmentNo14.pageactions.PageActions;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class SignInPage {

    private final WebDriver driver;
    private final By linkSingIn = By.linkText("Sign In");
    private final By txtEmail = By.id("email");
    private final By txtPassword = By.id("pass");
    private final By btnSingIn = By.id("send2");

    PageActions actions;

    //created parametrised constructor
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verifySignInPage(String txt_email, String txt_pass) {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Home Page
        actions.clickOnElement(linkSingIn);

        //SignIn Page
        actions.enterText(txtEmail, txt_email);
        actions.enterText(txtPassword, txt_pass);
        actions.clickOnElement(btnSingIn);
    }
}
