package org.alpha.darshan.assignment10.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EmiCalculatorPage {
    By homeLoanBtn=  By.id("loanamount");
    By interestRateBtn=  By.id("loaninterest");
    By loanT= By.id("loanterm");

    By loanEmi=   By.id("emiamount");

    By totalInterestRate=  By.id("emitotalinterest");

    By emiTotalAmount=  By.id("emitotalamount");
    WebDriver driver;
    public EmiCalculatorPage(WebDriver driver){
        this.driver=driver;
    }
    public void calculateEmi(){
        driver.findElement(homeLoanBtn).click();
        WebElement interestElement= driver.findElement(interestRateBtn);
        Actions actions= new Actions(driver);
        actions.doubleClick(interestElement).perform();
        interestElement.sendKeys(Keys.DELETE);
        interestElement.sendKeys("8.5");
        driver.findElement(loanT).click();
        System.out.println("---------- Breakup of Total Payment ----------\n");
        WebElement emiAmount=  driver.findElement(loanEmi);
        System.out.println(emiAmount.getText());
        WebElement interestRateP= driver.findElement(totalInterestRate);
        System.out.println(interestRateP.getText());
        WebElement totalPayable= driver.findElement(emiTotalAmount);
        System.out.println(totalPayable.getText());

        //number of rows
        WebElement numOfRows=  driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/article/div[3]/div/div[3]/div[2]/table/tbody/tr[1]"));
        WebElement columData=   driver.findElement(By.xpath("//*[@id=\"emipaymenttable\"]/table/tbody/tr[2]"));
        System.out.println(numOfRows.getText());
        System.out.println(columData.getText());


    }
}
