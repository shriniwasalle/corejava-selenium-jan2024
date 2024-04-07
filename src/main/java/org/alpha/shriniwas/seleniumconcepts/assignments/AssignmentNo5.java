package org.alpha.shriniwas.seleniumconcepts.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AssignmentNo5 {

    @Test
    public void verifyLinkTextsAndCounts() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        String linkTitle = "Product Offering";

        List<WebElement> links = driver.findElements(By.xpath("//p[text()='"+linkTitle+"']/following-sibling::ul[1]/li/a"));

        System.out.println("Total Links Count: " +links.size());

//        WebElement link1 = links.get(0);
//        WebElement link2 = links.get(1);
//
//        System.out.println(link1.getText());
//        System.out.println(link2.getText());
//

        for (WebElement link : links) {
            System.out.println(link.getText());
        }

//        for (int i = 0; i <= links.size()-1 ; i++) {
//            WebElement link = links.get(i);
//            System.out.println(link.getText());
//        }

//        ListIterator<WebElement> itr = links.listIterator();
//
//        while (itr.hasNext()) {
//            WebElement link = itr.next();
//            System.out.println(link.getText());
//        }

        driver.close();
    }
}
