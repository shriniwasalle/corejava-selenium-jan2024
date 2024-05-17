package org.alpha.tejashri.assignments.AssignmentNo10.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoanPage {

    private final WebDriver driver;

    private final By amount = By.id("loanamount");
    private final By IR = By.id("loaninterest");
    private final By tenure = By.id("loanterm");

    private final By emi = By.xpath("//div[@id='emiamount']//p[1]");
    private final By interestPay = By.xpath("//div[@id='emitotalinterest']//p[1]");
    private final By totalPay = By.xpath("//div[@id='emitotalamount']//p[1]");
    private final By tdHeaders = By.xpath("//th[contains(@id,'yearheader') or contains(@class, 'col-sm') or contains(@id,'paidtodateheader')]");
    private final By tdDetails2024 = By.xpath("//table/tbody/tr[contains(@class, 'yearlypaymentdetails')][1]//td[text()]");

    //created parametrised constructor
    public LoanPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoanPage(String enterIntRate) {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement loanAmount = driver.findElement(amount);
        loanAmount.click();

        WebElement intRate = driver.findElement(IR);
        Actions actions = new Actions(driver);

        //doubleClick(wedElement) method used for mouse left Double click
        actions.doubleClick(intRate).perform();
        intRate.sendKeys(Keys.DELETE);
        intRate.sendKeys(enterIntRate);

        WebElement loanTenure = driver.findElement(tenure);
        loanTenure.click();

        WebElement loanEmi = driver.findElement(emi);
        System.out.println("Loan EMI : " +loanEmi.getText() +"\n");

        WebElement totalInterestPayable = driver.findElement(interestPay);
        System.out.println("Total Interest Payable : " +totalInterestPayable.getText() +"\n");

        WebElement totalPayment = driver.findElement(totalPay);
        System.out.println("     Total Payment\n" +
                "(Principal + Interest) : " +totalPayment.getText() +"\n");

        List<WebElement> headers = driver.findElements(tdHeaders);
        List<WebElement> details2024 = driver.findElements(tdDetails2024);

        System.out.println("---------- Payments for the year 2024 ----------");

        for (int i = 0 ; i <= headers.size() - 1; i ++) {
            System.out.println(headers.get(i).getText() + " : " + details2024.get(i).getText() +"\n");
        }
    }
}