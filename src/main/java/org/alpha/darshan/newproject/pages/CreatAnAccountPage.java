package org.alpha.darshan.newproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreatAnAccountPage {

    WebDriver driver;

    public CreatAnAccountPage(WebDriver driver){
        this.driver= driver;
    }


    public void creatAccount(){

        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.linkText("Create an Account")).click();
        driver.findElement(By.id("firstname")).sendKeys("JhonHs");
        driver.findElement(By.id("lastname")).sendKeys("SinhagsDG");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("s111@gmail.com");
        driver.findElement(By.id("password")).sendKeys("DarshanPG@1926");
        driver.findElement(By.id("password-confirmation")).sendKeys("DarshanPG@1926");
        WebDriverWait wait= new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title=\"Create an Account\"]")));
        driver.findElement(By.xpath("//button[@title=\"Create an Account\"]")).click();

    }

    public String verifyMsg(){

        WebElement successMessage= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
        return successMessage.getText();
    }

}
