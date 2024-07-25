package org.alpha.sanjeevani.assignment.assignment10.pages;//

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomaLoanPage {
    private final WebDriver driver;
    private final By amount = By.id("loanamount");
    private final By IR = By.id("loaninterest");
    private final By tenure = By.id("loanterm");
    private final By emi=By.xpath("//div[@id='emiamount']//p[1]");
    private final By interestPay=By.xpath("//div[@id='emitotalinterest']//p[1]");
    private final By totalPay=By.xpath("//div[@id='emitotalamount']//p[1]");
    private final By tdHeaders = By.xpath("//th[contains(@id,'yearheader') or contains(@class, 'col-sm') or contains(@id,'paidtodateheader')]");//*[@id="yearheader"]
    private final By tdHeaderText = By.xpath("//table/tbody/tr[contains(@class, 'yearlypaymentdetails')][1]//td[text()]");////*[@id="year2024"]
    public HomaLoanPage(WebDriver driver){
        this.driver=driver;
    }
    public void VerifyHomeLoan(String enterIntRate){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions actions = new Actions(driver);//doubleClick(wedElement) method used for mouse left Double click

        WebElement enterAmount=driver.findElement(amount);
        enterAmount.click();
        actions.doubleClick(enterAmount).perform();
        enterAmount.sendKeys(Keys.DELETE);
        enterAmount.sendKeys("2000000");

        WebElement intRate=driver.findElement(IR);
        actions.doubleClick(intRate).perform();
        intRate.sendKeys(Keys.DELETE);
        intRate.sendKeys(enterIntRate);

        driver.findElement(tenure).click();
        WebElement loanEmi = driver.findElement(emi);
        System.out.println("Loan EMI : " + loanEmi.getText());

        WebElement totalInterestPayable = driver.findElement(interestPay);
        System.out.println("Total Interest Payable : " + totalInterestPayable.getText());
        driver.findElement(totalPay);

        List<WebElement>headers =driver.findElements(tdHeaders);
        List<WebElement> headerText = driver.findElements(tdHeaderText);

        System.out.println("--------------- Payments for the year 2024 ----------");

        for (int i=0;i<= headers.size()-1;i++){
            System.out.println(headers.get(i).getText()+":"+headerText.get(i).getText());
            System.out.println();

        }
    }
}
