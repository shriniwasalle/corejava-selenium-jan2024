package org.alpha.sanjeevani.seleniumconcepts.pom2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private final WebDriver driver;

   //WebElements
   private final By txtUserName = By.id("user-name");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //Page Actions
    public void loginToApplication(String userName, String password) {

        driver.findElement(txtUserName).sendKeys(userName);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnLogin).click();
    }

    public void loginToApplication() {
    }
}
