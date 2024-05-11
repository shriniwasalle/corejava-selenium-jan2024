package org.alpha.shriniwas.testngconcepts.parameterization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.DataFormatter;
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

public class DataProviderFromExcel {

    @Test(dataProvider = "getDataFromExcelWithObjectArrayWithLoops")
    public void verifyLogin(String userName, String password, String type) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName); // standard_user
        driver.findElement(By.id("password")).sendKeys(password); // secret_sauce
        driver.findElement(By.id("login-button")).click();

        switch (type) {
            case "valid" -> {
                String actualTitle = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
                String expectedTitle = "Products";
                Assert.assertEquals(actualTitle, expectedTitle);
            }
            case "locked_out" -> {
                String actualErrorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
                Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
            }
            case "invalid" -> {
                String actualErrorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
            }
        }

        driver.close();
    }

    @DataProvider(name = "getDataFromExcel")
    public Object [][] getDataFromExcel() throws IOException {

        File file = new File("D:\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\shriniwas\\testngconcepts\\parameterization\\LoginData.xlsx");

        FileInputStream fin = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fin);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        String data10 = sheet.getRow(1).getCell(0).getStringCellValue();
        String data11 = sheet.getRow(1).getCell(1).getStringCellValue();
        String data12 = sheet.getRow(1).getCell(2).getStringCellValue();

        String data20 = sheet.getRow(2).getCell(0).getStringCellValue();
        String data21 = sheet.getRow(2).getCell(1).getStringCellValue();
        String data22 = sheet.getRow(2).getCell(2).getStringCellValue();

        String data30 = sheet.getRow(3).getCell(0).getStringCellValue();
        String data31 = sheet.getRow(3).getCell(1).getStringCellValue();
        String data32 = sheet.getRow(3).getCell(2).getStringCellValue();

        Object [][] objArr = {
                                {data10, data11, data12},
                                {data20, data21, data22},
                                {data30, data31, data32},
                             };

        return objArr;
    }

    @DataProvider(name = "getDataFromExcelWithObjectArray")
    public Object [][] getDataFromExcelWithObjectArray() throws IOException {

        File file = new File("D:\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\shriniwas\\testngconcepts\\parameterization\\LoginData.xlsx");

        FileInputStream fin = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fin);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        Object [][] objArr = new Object[3][3]; // rows = 3, columns = 3

        /* objArr[0][0] = "Shri00";
        objArr[0][1] = "Shri01";
        objArr[0][2] = "Shri02";

        objArr[1][0] = "Shri10";
        objArr[1][1] = "Shri11";
        objArr[1][2] = "Shri12";

        objArr[2][0] = "Shri20";
        objArr[2][1] = "Shri21";
        objArr[2][2] = "Shri22";*/

        objArr[0][0] = sheet.getRow(1).getCell(0).getStringCellValue(); // standard_user
        objArr[0][1] = sheet.getRow(1).getCell(1).getStringCellValue(); // secret_sauce
        objArr[0][2] = sheet.getRow(1).getCell(2).getStringCellValue(); // valid

        objArr[1][0] = sheet.getRow(2).getCell(0).getStringCellValue(); // locked_out_user
        objArr[1][1] = sheet.getRow(2).getCell(1).getStringCellValue(); // secret_sauce
        objArr[1][2] = sheet.getRow(2).getCell(2).getStringCellValue(); // locked_out

        objArr[2][0] = sheet.getRow(3).getCell(0).getStringCellValue(); // standard_user123
        objArr[2][1] = sheet.getRow(3).getCell(1).getStringCellValue(); // secret_sauce123
        objArr[2][2] = sheet.getRow(3).getCell(2).getStringCellValue(); // invalid

        /* objArr = {
            {"standard_user", "secret_sauce", "valid"},
            {"locked_out_user", "secret_sauce", "locked_out"},
            {"standard_user123", "secret_sauce123", "invalid"}
        } */

        return objArr;
    }

    @DataProvider(name = "getDataFromExcelWithObjectArrayWithLoops")
    public Object [][] getDataFromExcelWithObjectArrayWithLoops() throws IOException {

        File file = new File("D:\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\shriniwas\\testngconcepts\\parameterization\\LoginData.xlsx");

        FileInputStream fin = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fin);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowsCount = sheet.getLastRowNum(); // // Total 4 rows

        int colsCount = sheet.getRow(1).getLastCellNum(); // Total 3 columns

        Object [][] objArr = new Object[rowsCount][colsCount]; // rows = 3, columns = 3

        for (int row = 0 ; row <= rowsCount - 1; row++) {
            // row = 0, 1, 2
            for (int col = 0; col <= colsCount - 1; col++) {
                // col = 0,1,2

                DataFormatter formatter = new DataFormatter(); // To Format the cell values in String type

                objArr[row][col] = formatter.formatCellValue(sheet.getRow(row + 1).getCell(col));

                // sheet.getRow(row + 1).getCell(col).getStringCellValue();
            }
        }
        return objArr;
    }
}
