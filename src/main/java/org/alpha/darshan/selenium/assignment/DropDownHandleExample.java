package org.alpha.darshan.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandleExample {

    static WebDriver driver;

    @Test
    public void dropDownHandle(){

        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();

        driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

           By countryList= By.id("Form_getForm_Country");

        /*Select select= new Select(driver.findElement(countryList));
        select.selectByVisibleText("India");*/

        doSelectByVisibleText(countryList,"India");
    }

    public static WebElement getElement(By locator){

        return driver.findElement(locator);
    }

    public static void doSelectByVisibleText(By locator,String value){
    Select select= new Select(getElement(locator));
    select.selectByVisibleText(value);
    }
}
