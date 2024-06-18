package org.alpha.sanjeevani.assignment.AssignmentNo3RegisterAccount.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By txtUserName=By.id("user-name");
    private final By txtPassWord=By.id("password");
    private final By btnLogin=By.id("login-button");

    public LoginPage(WebDriver driver ){
        this.driver=driver;
    }
    public void loginToApplication(String userName,String passWord) {

        driver.findElement(txtUserName).sendKeys(userName);
        driver.findElement(txtPassWord).sendKeys(passWord);
        driver.findElement(btnLogin).click();
    }
}
