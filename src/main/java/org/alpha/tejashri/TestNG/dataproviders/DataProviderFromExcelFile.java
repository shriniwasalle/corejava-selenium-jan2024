package org.alpha.tejashri.TestNG.dataproviders;

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

public class DataProviderFromExcelFile {

    @Test(dataProvider = "getDataFromExcelWithObjectArrayUsingLoops")
    public void verifyLogIn(String userName, String password, String type) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        switch (type) {
            case "valid", "problem", "performance", "error", "visual" -> {

                String actualHeading = driver.findElement(By.xpath("//span[@data-test='title']")).getText();
                String expectedHeading = "Products";
                Assert.assertEquals(actualHeading, expectedHeading);
            }
            case "locked_out" -> {

                String actualErrorMassage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMassage = "Epic sadface: Sorry, this user has been locked out.";
                Assert.assertEquals(actualErrorMassage, expectedErrorMassage);
            }
            case "invalid" -> {

                String actualErrorMassage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                String expectedErrorMassage = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(actualErrorMassage, expectedErrorMassage);
            }
        }
        driver.close();
    }

    @DataProvider(name = "getDataFromExcel")
    public Object[][] getDataFromExcel() throws IOException {
        File file = new File("D:\\Automation\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\tejashri\\TestNG\\dataproviders\\LogInData.xlsx");
        FileInputStream fIn = new FileInputStream(file);

        //workbook --> complete Excel file having multiple sheets with multiple cells(Rows & Colloums) in that we have our data
        XSSFWorkbook workbook = new XSSFWorkbook(fIn);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        //Values taken from Excel sheet
        String data10 = sheet.getRow(1).getCell(0).getStringCellValue();
        String data11 = sheet.getRow(1).getCell(1).getStringCellValue();
        String data12 = sheet.getRow(1).getCell(2).getStringCellValue();

        String data20 = sheet.getRow(2).getCell(0).getStringCellValue();
        String data21 = sheet.getRow(2).getCell(1).getStringCellValue();
        String data22 = sheet.getRow(2).getCell(2).getStringCellValue();

        String data30 = sheet.getRow(3).getCell(0).getStringCellValue();
        String data31 = sheet.getRow(3).getCell(1).getStringCellValue();
        String data32 = sheet.getRow(3).getCell(2).getStringCellValue();

//        System.out.println(data10);
//        System.out.println(data11);
//        System.out.println(data12);

        Object[][] objArr = {
                {data10, data11, data12},
                {data20, data21, data22},
                {data30, data31, data32},
        };
        return objArr;
    }

    @DataProvider(name = "getDataDynamicValuesWithObjectArray")
    public Object[][] getDataDynamicValuesWithObjectArray() throws IOException {

        Object[][] objArr = new Object[3][3]; // Row=3, Column=3

        //HardCoded values provided here

        objArr[0][0] = "Shri00";
        objArr[0][1] = "Shri01";
        objArr[0][2] = "Shri02";

        objArr[1][0] = "Shri10";
        objArr[1][1] = "Shri11";
        objArr[1][2] = "Shri12";

        objArr[2][0] = "Shri20";
        objArr[2][1] = "Shri21";
        objArr[2][2] = "Shri22";

        System.out.println(objArr[0][0]);
        System.out.println(objArr[0][1]);
        System.out.println(objArr[0][2]);

        System.out.println(objArr[1][0]);
        System.out.println(objArr[1][1]);
        System.out.println(objArr[1][2]);

        System.out.println(objArr[2][0]);
        System.out.println(objArr[2][1]);
        System.out.println(objArr[2][2]);

        //In this way the values are stored
        /*
        Object[][] objArr = {
                {"Shri00, Shri01, Shri02" },
                {"Shri10, Shri11, Shri12" },
                {"Shri20, Shri21, Shri22" },
        };
        */

        return objArr;
    }

    @DataProvider(name = "getDataFromExcelWithObjectArray")
    public Object[][] getDataFromExcelWithObjectArray() throws IOException {
        File file = new File("D:\\Automation\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\tejashri\\TestNG\\dataproviders\\LogInData.xlsx");
        FileInputStream fIn = new FileInputStream(file);

        //workbook --> complete Excel file having multiple sheets with multiple cells(Rows & Columns) in that we have our data
        XSSFWorkbook workbook = new XSSFWorkbook(fIn);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        Object[][] objArr = new Object[3][3]; // Row=3, Column=3

        //Values taken from Excel sheet
        objArr[0][0] = sheet.getRow(1).getCell(0).getStringCellValue();//standard_user
        objArr[0][1] = sheet.getRow(1).getCell(1).getStringCellValue();//secret_sauce
        objArr[0][2] = sheet.getRow(1).getCell(2).getStringCellValue();//valid

        objArr[1][0] = sheet.getRow(2).getCell(0).getStringCellValue();//locked_out_user
        objArr[1][1] = sheet.getRow(2).getCell(1).getStringCellValue();//secret_sauce
        objArr[1][2] = sheet.getRow(2).getCell(2).getStringCellValue();//locked_out

        objArr[2][0] = sheet.getRow(3).getCell(0).getStringCellValue();//standard_user123
        objArr[2][1] = sheet.getRow(3).getCell(1).getStringCellValue();//secret_sauce123
        objArr[2][2] = sheet.getRow(3).getCell(2).getStringCellValue();//invalid

        //In this way the values are stored
        /*
        Object[][] objArr = {
                {"standard_user, secret_sauce, valid" },
                {"locked_out_user, secret_sauce, locked_out" },
                {"standard_user123, secret_sauce123, invalid" },
        };
        */

        return objArr;
    }

    @DataProvider(name = "getDataFromExcelWithObjectArrayUsingLoops")
    public Object[][] getDataFromExcelWithObjectArrayUsingLoops() throws IOException {
        File file = new File("D:\\Automation\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\tejashri\\TestNG\\dataproviders\\LogInData.xlsx");
        FileInputStream fIn = new FileInputStream(file);

        //workbook --> complete Excel file having multiple sheets with multiple cells(Rows & Columns) in that we have our data
        XSSFWorkbook workbook = new XSSFWorkbook(fIn);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowsCount = sheet.getLastRowNum();
        System.out.println("Total Row Count : " +rowsCount);//Total 4-1= 3 rows

        int cellsCount = sheet.getRow(1).getLastCellNum();
        System.out.println("Total Column/cell Count : " +cellsCount);//Total 3 columns

        Object[][] objArr = new Object[rowsCount][cellsCount]; // Row=3, Column=3

        for(int i=0; i <= rowsCount-1; i++){ //i = row
            //i=0
            //i=1
            //i=2
            for(int j=0; j <= cellsCount-1; j++){ //j= column/cell

                //objArr[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
                //This (objArr[i][j]) object array takes only string values bcz getStringCellValue() method used,
                //this method will returns only string values,
                //If we add integer value in Excel sheet it through an error IllegalStatementException,
                //(Can not get a String value from a Numeric cell )

                DataFormatter formatter = new DataFormatter();
                objArr[i][j] = formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
                //Now (objArr[i][j]) object array takes any format(String, Integer, Float ect) data can be accepted with this DataFormatter class
                //& it will convert into String by using formatCellValue() method

                //j=0, i=1
    //i=0-->    //j=1, i=1
                //j=2, i=1

                //j=0, i=2
    //i=1-->    //j=1, i=2
                //j=2, i=2

                //j=0, i=3
    //i=2-->    //j=1, i=3
                //j=2, i=3
            }
        }
        return objArr;
    }
}
