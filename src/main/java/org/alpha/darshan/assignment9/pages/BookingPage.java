package org.alpha.darshan.assignment9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookingPage {
    WebDriver driver;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getTrainDetails() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[1]/span")));
        WebElement result = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[1]/span"));
        System.out.println(result.getText());

        List<WebElement> trainList = driver.findElements(By.xpath("//div[@class=\"col-sm-5 col-xs-11 train-heading\"]"));

        List<WebElement> timingList = driver.findElements(By.xpath("//div[@class=\"white-back no-pad col-xs-12\"]"));

        List<WebElement> timeL = driver.findElements(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[3]"));
        int timeNumber= timeL.size();

        for (WebElement list : trainList) {
            System.out.println(list.getText());
            for (int i=0;i<=timeNumber;i++){
                System.out.println(timeNumber);
            }
        }
    }
}
