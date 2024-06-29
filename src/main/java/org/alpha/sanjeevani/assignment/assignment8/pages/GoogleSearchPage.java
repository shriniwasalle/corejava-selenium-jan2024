package org.alpha.sanjeevani.assignment.assignment8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class GoogleSearchPage {
    private final WebDriver driver;
    private final By txtField=By.id("APjFqb");
    private final By txtListBox=By.xpath("//ul[@role='listbox']/li");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void googleSearchPage() throws InterruptedException {
        driver.findElement(txtField).sendKeys("selenium");
        Thread.sleep(2000);

        List<WebElement> searchResults = driver.findElements(txtListBox);

        for (WebElement result : searchResults) {
            System.out.println(result.getText());
        }
    }
}