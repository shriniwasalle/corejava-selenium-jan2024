package org.alpha.aishwarya.seleniumconcepts.pom1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   //WebDriver driver = null, if we Declear at instance, by default value null aste tyamule op= Null Pinter exception yeata
    public void LoginToApplication(WebDriver driver){
        // Page Related

        driver.findElement(By.id("user-name")).sendKeys("standard_user"); // driver TestLogin page mdhun access krne.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }


}
