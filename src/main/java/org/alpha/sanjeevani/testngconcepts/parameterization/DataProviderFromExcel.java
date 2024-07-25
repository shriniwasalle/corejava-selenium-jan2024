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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderFromExcel {

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
    public Object[][] getDataFromExcel() throws IOException, InvalidFormatException {
        File file = new File("C:\\Users\\Dell\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\sanjeevani\\testngconcepts\\parameterization\\loginData.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("sheet1");

        String data00 = sheet.getRow(0).getCell(0).getStringCellValue();
        String data01 = sheet.getRow(0).getCell(1).getStringCellValue();
        String data02 = sheet.getRow(0).getCell(2).getStringCellValue();

        String data10 = sheet.getRow(1).getCell(0).getStringCellValue();
        String data11 = sheet.getRow(1).getCell(1).getStringCellValue();
        String data12 = sheet.getRow(1).getCell(2).getStringCellValue();

        String data20 = sheet.getRow(2).getCell(0).getStringCellValue();
        String data21 = sheet.getRow(2).getCell(1).getStringCellValue();
        String data22 = sheet.getRow(2).getCell(2).getStringCellValue();
      System.out.println(data00);
        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data10);
        System.out.println(data11);
        System.out.println(data12);
        System.out.println(data20);
        System.out.println(data21);
        System.out.println(data22);

        return new Object[][]{ {data00,data01,data02},
                               {data10,data11,data12},
                               {data20,data21,data22}
                             };


    }
}
