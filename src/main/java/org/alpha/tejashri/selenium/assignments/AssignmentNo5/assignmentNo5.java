package org.alpha.tejashri.selenium.assignments.AssignmentNo5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.ListIterator;

public class assignmentNo5 {

    @Test
    public void verifyLinkTextAndCounts() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();

        System.out.println("Title : " +driver.getTitle());

        WebElement txtLink = driver.findElement(By.xpath("//p[text()='Product Offering']"));

        String txtLinkTitle = txtLink.getText();

        System.out.println("Actual Link Title : " +txtLinkTitle);

        String linkTitle = "Product Offering";

        List<WebElement> links = driver.findElements(By.xpath("//p[text()='" + linkTitle + "']/following-sibling::ul[1]/li/a"));

        System.out.println("Total Links Count in " +linkTitle+ " are : " + links.size());

        //WebElement link1 = links.get(0);
        //WebElement link2 = links.get(1);
        //System.out.println(link1.getText());
        //System.out.println(link2.getText());

        System.out.println("----- Iterate using for each loop -----");
        for (WebElement link : links) {
            System.out.println(link.getText());
        }

        System.out.println("----- Iterate using for loop -----");
        for (int i = 0; i <= links.size() - 1; ++i) {
            WebElement link = links.get(i);
            System.out.println(link.getText());
        }

        System.out.println("----- Iterate using ListIterator with while loop -----");
        ListIterator<WebElement> itr = links.listIterator();

        while (itr.hasNext()) {
            WebElement link = itr.next();
            System.out.println(link.getText());
        }

        //Assertions
        Assert.assertNotEquals(txtLinkTitle, linkTitle);
    }
}