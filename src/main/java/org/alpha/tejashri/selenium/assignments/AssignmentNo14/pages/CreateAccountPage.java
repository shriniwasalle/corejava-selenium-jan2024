package org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages;

import org.alpha.tejashri.selenium.assignments.AssignmentNo14.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private final WebDriver driver;
    private final By linkCreate = By.linkText("Create an Account");
    private final By firstName = By.id("firstname");
    private final By lastName = By.id("lastname");
    private final By email = By.id("email_address");
    private final By password = By.id("password");
    private final By confirmPassword = By.id("password-confirmation");
    private final By btnSubmit = By.xpath("//button[@class='action submit primary']");

    PageActions actions;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verityCreateAccountPage(String firstname, String lastname, String txtEmail, String txtPass, String confPass ) {

        actions.clickOnElement(linkCreate);

        //Personal Information page
        actions.enterText(firstName, firstname);
        actions.enterText(lastName, lastname);

        //Sign-in Information
        actions.enterText(email, txtEmail);
        actions.enterText(password, txtPass);
        actions.enterText(confirmPassword, confPass);
        actions.clickOnElement(btnSubmit);
    }
}
