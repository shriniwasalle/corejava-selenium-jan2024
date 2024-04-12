package org.alpha.tejashri.selenium.pom.pom2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    //Web Elements
    //By is an Abstract class
    private final By txtUserName = By.id("user-name");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.id("login-button");


    //Created the Parameterized Constructor
    //The constructor of driver variable can use throughout the class
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Page Actions
    public void loginToApplication(String userName, String password){

        //Login Page Related Actions - Finding elements & performing actions on it
        driver.findElement(txtUserName).sendKeys(userName);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnLogin).click();
    }

    public void getErrorMassage(){

    }
}
