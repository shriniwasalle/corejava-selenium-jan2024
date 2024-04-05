package org.alpha.tejashri.selenium.assignments.AssignmentNo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class assignmentNo1_VerifyingTitleWithEdgeDriveWithTestNG {
    public void VerifyingTitle() {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " +actualTitle);

        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

        Assert.assertEquals(actualTitle, expectedTitle);

        driver.close();
    }
}
