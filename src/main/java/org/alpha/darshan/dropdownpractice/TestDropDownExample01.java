package org.alpha.darshan.dropdownpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.alpha.darshan.selenium.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDropDownExample01 extends BaseTest {

    @Test
    public void dropDownHandle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        WebElement ddlCourseName=  driver.findElement(By.xpath("//select[@id=\"course\"]"));
        Select select= new Select(ddlCourseName);
        select.selectByIndex(1);
        select.selectByVisibleText("Dot Net");
        select.selectByValue("python");
    }

}
