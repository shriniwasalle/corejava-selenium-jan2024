package org.alpha.darshan.pom2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    WebDriver driver;
    public LogInPage(WebDriver driver){
        this.driver= driver;
    }
    public void logInToApplication(String userName,String password){
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement( By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}
