package org.alpha.tejashri.selenium.assignments.AssignmentNo14.pages;

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

    private final By btnSubmit = By.xpath("//button[@class=\"action submit primary\"]");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verityCreateAccountPage() {
        driver.findElement(linkCreate).click();

        //Personal Information page
        driver.findElement(firstName).sendKeys("Abc");
        driver.findElement(lastName).sendKeys("Xyz");

        //Sign-in Information
        driver.findElement(email).sendKeys("abc123xyz@example.com");
        driver.findElement(password).sendKeys("abcxyz@123");
        driver.findElement(confirmPassword).sendKeys("abcxyz@123");
        driver.findElement(btnSubmit).click();
    }


}
