package org.alpha.sanjeevani.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class TestSeleniumHandlingDropDowns extends BaseTest{
    @Test
    public void verifyDropDowns() throws InterruptedException {
       WebDriver driver= initBrowser("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html","chrome");
     //System.out.println(driver.getTitle());

        WebElement ddlCourseName=driver.findElement(By.xpath("//select[@id='course']"));
        Thread.sleep(2000);

        Select courseName=new Select(ddlCourseName);
        Thread.sleep(2000);

        courseName.selectByIndex(2);//Javascript
        Thread.sleep(2000);

        courseName.selectByVisibleText("Java");//java
        Thread.sleep(2000);

        courseName.selectByValue("net");//Dot net

        List<WebElement>courses= courseName.getOptions();

        System.out.println("Toatal element in courses is :"+courses.size());
        System.out.println(courses.get(1).getText());

        for (WebElement course:courses){
            System.out.println(course.getText());
        }

        System.out.println("Is this multi-Selection Drop-Downs"+courseName.isMultiple());// false

        System.out.println("Get first Selected element:"+courseName.getFirstSelectedOption().getText());//Dot Net

        driver.close();

    }
}
