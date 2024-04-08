package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class TestSeleniumMultipleHandlingDropDowns extends BaseTest{
    @Test
    public void verifyMultipleDropDowns(){

       WebDriver driver= initBrowser("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html","chrome");
     //System.out.println(driver.getTitle());

        WebElement ddlIde=driver.findElement(By.id("ide"));

        Select ide=new Select(ddlIde);
        System.out.println("Is Multiple :"+ide.isMultiple());

        ide.selectByVisibleText("IntelliJ IDEA");

        ide.selectByValue("ec");

       // driver.close();

    }
}
