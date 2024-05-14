package org.alpha.darshan.assignment9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTrain {

    By fromSearchBtn=By.xpath("//input[@role=\"searchbox\" and @aria-controls=\"pr_id_1_list\"]");
    By toSearchBtn=By.xpath("//input[@role=\"searchbox\" and @aria-controls=\"pr_id_2_list\"]");

    By classesBtn=By.xpath("//span[@class=\"ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down\"]");

    By sleeperCouchBtn=By.xpath("//li[@role=\"option\" and @aria-label=\"Sleeper (SL)\"]");

    By submitBtn=By.xpath("//button[@label=\"Find Trains\"]");
    WebDriver driver;

    public SearchTrain(WebDriver driver){
        this.driver=driver;
    }
   public void searchTrainDetails() {
        driver.findElement(fromSearchBtn).sendKeys("SOLAPUR JN - SUR");
//        WebDriverWait waits= new WebDriverWait(driver,10);
//        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/a")));
//        driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/a")).click();
        driver.findElement(toSearchBtn).sendKeys("PUNE JN - PUNE (PUNE)");
        driver.findElement(classesBtn).click();
        driver.findElement(sleeperCouchBtn).click();
       WebDriverWait wait= new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));
        driver.findElement(submitBtn).click();
    }
}
