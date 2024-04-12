package org.alpha.darshan.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.alpha.darshan.selenium.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMultipleHandle extends BaseTest {

    @Test
    public void multipleDropDown(){

    WebDriver driver=  browserInit("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html","chrome");
    WebElement mulddl= driver.findElement(By.id("ide"));
        Select select= new Select(mulddl);

        select.selectByIndex(1);

        select.selectByValue("ec");

        select.deselectByIndex(0);

        select.selectByIndex(3);

        select.deselectAll();

        driver.close();
    }

}
