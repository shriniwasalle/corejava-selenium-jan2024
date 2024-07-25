package org.alpha.sanjeevani.testngconcepts.parameterization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DynamicDataProviderFromExcelPractice {
    @Test(dataProvider = "getDataFromExcel")
    public void verifyLogin(String userName, String password, String type) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if (type.equals("valid")) {
            String actualTitle = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
            String expectedTitle = "Products";
            Assert.assertEquals(actualTitle, expectedTitle);
        } else if (type.equals("locked_out")) {
            String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            String expectedError = "Epic sadface: Sorry, this user has been locked out.";
            Assert.assertEquals(error, expectedError);
        } else if (type.equals("invalid")) {
            String errorInvalid = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            String expectedInvalidError = "Epic sadface: Username and password do not match any user in this service";
            Assert.assertEquals(errorInvalid, expectedInvalidError);
        }
        driver.close();
    }
@DataProvider(name = "getDataFromExcel")
public Object[][] getDataFromExcel() throws IOException {
        File file = new File("C:\\Users\\Dell\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\sanjeevani\\testngconcepts\\parameterization\\loginData.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("sheet1");

        Object[][] objArr=new Object[3][3];

    System.out.println(objArr[0][0]="sanju00");
    System.out.println(objArr[0][1]="sanju01");
    System.out.println(objArr[0][2]="sanju02");

    System.out.println(objArr[1][0]="sanju10");
    System.out.println(objArr[1][1]="sanju11");
    System.out.println(objArr[1][2]="sanju12");

    System.out.println(objArr[2][0]="sanju20");
    System.out.println(objArr[2][1]="sanju21");
    System.out.println(objArr[2][2]="sanju22");

    return objArr;

       }
}
