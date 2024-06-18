package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class TestSeleniumMultipleHandlingDropDowns extends BaseTest{
    @Test
    public void verifyMultipleDropDowns() throws MalformedURLException {

       WebDriver driver= initBrowser("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html","chrome");
     //System.out.println(driver.getTitle());

        WebElement ddlIde=driver.findElement(By.id("ide"));

        Select ide=new Select(ddlIde);
        System.out.println("Is Multiple :"+ide.isMultiple());

        ide.selectByVisibleText("IntelliJ IDEA");
        ide.selectByValue("ec");
        ide.selectByIndex(2);

        // ide.deselectByVisibleText("Eclipse");
        //ide.deselectByValue("ij");
        //ide.deselectByIndex(2);

       // ide.deselectAll();

       List<WebElement>options =ide.getAllSelectedOptions();
       for (WebElement option:options){
           System.out.println(option.getText());
       }

        driver.close();

    }
}
