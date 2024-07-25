
package org.alpha.sanjeevani.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment5 {
    @Test
    public void verifyLinks() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        String linkTitle = "About the Site";

        driver.manage().window().maximize();

        // Retrieve all links on the page
        List<WebElement> links = driver.findElements(By.xpath("//p[text()='" + linkTitle + "']/following-sibling::ul[1]/li/a"));

        /*WebElement link=links.get(0);
        System.out.println(link.getText());

       WebElement list1= links.get(1);
        System.out.println(list1.getText());*/

        // Print total links count
        System.out.println("Total Links Count: " + links.size());

        // Print link texts
        System.out.println("Link Texts: ");

        for (WebElement link : links)
            System.out.println(link.getText());

        /*for (int i=0;i<= links.size()-1;i++){
            WebElement text=links.get(i);
            System.out.println(text.getText());
        }*/

        // ListIterator<WebElement> itr=links.listIterator();

        /*while (itr.hasNext()){

            WebElement links1=itr.next();
            System.out.println(links1.getText());
        }*/

        driver.close();
    }

}