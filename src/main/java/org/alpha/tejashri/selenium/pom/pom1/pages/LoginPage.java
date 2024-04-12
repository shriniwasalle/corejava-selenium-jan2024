package org.alpha.tejashri.selenium.pom.pom1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public void loginToApplication(WebDriver driver){

        //Login Page Related Actions - Finding elements & performing actions on it
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

}
