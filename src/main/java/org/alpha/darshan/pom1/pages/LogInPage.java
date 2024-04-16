package org.alpha.darshan.pom1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    private final By txtUserName= By.id("user-name");
   private final By txtPass= By.id("password");
    private final By btnLogin= By.id("login-button");
    WebDriver driver;
    public LogInPage(WebDriver driver){
        this.driver=driver;
    }
    public void logInToApplication(String useName,String password){
        driver.findElement(txtUserName).sendKeys(useName);
        driver.findElement(txtPass).sendKeys(password);
        driver.findElement(btnLogin).click();
    }
}
