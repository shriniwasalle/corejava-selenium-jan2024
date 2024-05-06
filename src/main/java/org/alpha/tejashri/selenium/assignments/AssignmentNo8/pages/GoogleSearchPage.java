package org.alpha.tejashri.selenium.assignments.AssignmentNo8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchPage {

    private final WebDriver driver;

    private final By btnSrc = By.id("APjFqb");
    private final By fstSearch = By.xpath("(//span[text()='selenium'])[1]");
    private final By search = By.xpath("//div[@class='wM6W7d'][1]/span/b");

    //created parametrised constructor
    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getSearch(String enterSearch) {
        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(btnSrc).sendKeys(enterSearch);

        WebElement firstSearch = driver.findElement(fstSearch);
        String firstWord = firstSearch.getText();

        System.out.println("----------Selenium Search Result List----------");
        System.out.println(firstSearch.getText());

        List<WebElement> lists = driver.findElements(search);

        for (WebElement list : lists) {
            System.out.println(firstWord + " " + list.getText());
        }
    }
}
