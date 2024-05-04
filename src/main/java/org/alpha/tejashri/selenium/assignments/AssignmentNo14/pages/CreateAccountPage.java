package org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages;

import org.alpha.tejashri.selenium.assignments.AssignmentNo14.pageactions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {
    private final WebDriver driver;
    PageActions actions;
    private final By linkCreate = By.linkText("Create an Account");

    private final By firstName = By.id("firstname");

    private final By lastName = By.id("lastname");
    private final By email = By.id("email_address");
    private final By password = By.id("password");
    private final By confirmPassword = By.id("password-confirmation");

    private final By btnSubmit = By.xpath("//button[@class=\"action submit primary\"]");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        actions = new PageActions(driver);
    }

    public void verityCreateAccountPage() {
        // driver.findElement(linkCreate).click();
        actions.clickOnElement(linkCreate);

        //Personal Information page
        // driver.findElement(firstName).sendKeys("Abc");
        actions.enterText(firstName, "Abc");
        actions.enterText(lastName, "Xyz");
        /// driver.findElement(lastName).sendKeys("Xyz");

        //Sign-in Information
        actions.enterText(email, "abc123xyz@example.com");
        actions.enterText(password, "abcxyz@123");
        actions.enterText(confirmPassword, "abcxyz@123");
//        driver.findElement(email).sendKeys("abc123xyz@example.com");
//        driver.findElement(password).sendKeys("abcxyz@123");
//        driver.findElement(confirmPassword).sendKeys("abcxyz@123");
        // driver.findElement(btnSubmit).click();
        actions.clickOnElement(btnSubmit);
    }
}
