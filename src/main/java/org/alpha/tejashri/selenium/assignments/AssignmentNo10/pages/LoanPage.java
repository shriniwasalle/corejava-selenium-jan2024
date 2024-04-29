package org.alpha.tejashri.selenium.assignments.AssignmentNo10.pages;

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
    private final By tablePath = By.xpath("/html/body/div[1]/div[1]/main/article/div[3]/div/div[3]/div[2]/table");
    private final By rowsPath = By.xpath("/html/body/div[1]/div[1]/main/article/div[3]/div/div[3]/div[2]/table/tbody/tr");
    private final By cellsPath = By.xpath("/html/body/div[1]/div[1]/main/article/div[3]/div/div[3]/div[2]/table/tbody//th");

    private final By cells2Path = By.xpath("/html/body/div[1]/div[1]/main/article/div[3]/div/div[3]/div[2]/table/tbody/tr[2]/td");

    //created parametrised constructor
    public LoanPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoanPage() {

        //Implicit Wait added
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement loanAmount = driver.findElement(amount);
        loanAmount.click();

        WebElement intRate = driver.findElement(IR);
        Actions actions = new Actions(driver);

        //doubleClick(wedElement) method used for mouse left Double click
        actions.doubleClick(intRate).perform();
        intRate.sendKeys(Keys.DELETE);
        intRate.sendKeys("8.5");

        WebElement loanTenure = driver.findElement(tenure);
        loanTenure.click();

        WebElement loanEmi = driver.findElement(emi);
        System.out.println("Loan EMI : " + loanEmi.getText());

        WebElement totalInterestPayable = driver.findElement(interestPay);
        System.out.println("Total Interest Payable : " + totalInterestPayable.getText());

        WebElement totalPayment = driver.findElement(totalPay);
        System.out.println("     Total Payment\n" +
                "(Principal + Interest) : " + totalPayment.getText());

        System.out.println("-------------------------------------");

        //Locate the table element
        WebElement table = driver.findElement(tablePath);
        //Locate all rows of the table
        List<WebElement> rows = table.findElements(rowsPath);
        //Iterating each row
        for (WebElement row : rows) {

            //To get table cells
            List<WebElement> cells = row.findElements(cellsPath);
            //Iterating each cell
            for (WebElement cell : cells) {
                System.out.println(cell.getText());

            }

            System.out.println("-------------------------------------");

            //To get table cells2
            List<WebElement> cells2 = row.findElements(cells2Path);

            //Iterating each cell
            for (WebElement cell2 : cells2) {
                System.out.println(cell2.getText());
            }
            break;
        }
    }
}