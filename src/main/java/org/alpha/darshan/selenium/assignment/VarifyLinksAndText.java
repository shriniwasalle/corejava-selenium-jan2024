package org.alpha.darshan.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class VarifyLinksAndText {
    @Test
    public void verfiyLink(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();

        String linkTitle="MakeMyTrip";

        List<WebElement> links= driver.findElements(By.xpath("//p[text()='"+linkTitle+"']/following-sibling::ul[1]/li/a"));
        System.out.println("Total number of links= "+links.size());
//         WebElement link=   links.get(0);
//         link.getText();

         for (WebElement link  :links){
             System.out.println(link.getText());
         }

         for (int i=0;i<=links.size()-1;i++){
            WebElement link=  links.get(i);
             System.out.println(link.getText());
         }

    }
}
