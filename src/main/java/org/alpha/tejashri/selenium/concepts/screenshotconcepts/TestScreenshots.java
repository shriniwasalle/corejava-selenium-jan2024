package org.alpha.tejashri.selenium.concepts.screenshotconcepts;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class TestScreenshots extends BaseCodeTest {

    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void verifyScreenshots() throws IOException {

        //Date is class in java.util
        Date currentDayDateTime = new Date();
        System.out.println("Before Format : Current Day, Date & Time : " + currentDayDateTime);

        //SimpleDateFormat is a class in java.text
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");//12 hr format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//24 hr format

        //format() is a method present in DateFormat abstract class
        String dateTime = simpleDateFormat.format(currentDayDateTime);
        System.out.println("After Format : Current Date & Time : " + dateTime);

        //Called captureScreenshot() method
        captureScreenshot(driver, "Test_" + dateTime);//fileName = Test_2024-04-20-22-00-52

        /*
        -Type cast the driver into TakesScreenshot.
        -TakesScreenshot is an interface in selenium in that getScreenshotAs() is method.
        -OutputType<T> is an interface in selenium.
        -3 types of <T>
            1. <File> FILE
            2. <String> BASE64
            3. <byte []> BYTES
        */

//        TakesScreenshot ts = (TakesScreenshot) driver;

        //1. <File> FILE
        /*
        To store the screenshot in file, create the object of File class
        which is present in Java.io & provide the folder path as a parameter (where we want to save)
        To copy file use the copyFile(srcFile, destFile) method from FileUtils class which is present in apache.commons.io.
        src- Source file, dest- Destination file
        */

//        File srcFile = ts.getScreenshotAs(OutputType.FILE);//FILE return type is file
//        File destFile = new File(System.getProperty("user.dir") + "\\src\\main\\java\\org\\alpha\\tejashri\\selenium\\sreenshots\\Test_" + dateTime + ".jpg");//appending dateTime in File name
//        FileUtils.copyFile(srcFile, destFile);

        //2. <String> BASE64
        //Base64 is a class in java.util

//        String base64Str = ts.getScreenshotAs(OutputType.BASE64);//BASE64 return type is string
//        System.out.println(base64Str);//Output will be in a string
//
        // converting string into byte array by using decode() method
//        byte[] byteArr = Base64.getDecoder().decode(base64Str);

        //FileOutputStream is a class in  java. io - used for store data in that file
//        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\java\\org\\alpha\\tejashri\\selenium\\sreenshots\\Test_" + dateTime + ".jpg");
//        fos.write(byteArr);
//        fos.close();

        //3. <byte []> BYTES

//        byte[] byteArr = ts.getScreenshotAs(OutputType.BYTES);//BYTES return type is byte[]
//        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\java\\org\\alpha\\tejashri\\selenium\\sreenshots\\Test_" + dateTime + ".jpg");
//        fos.write(byteArr);
//        fos.close();

    }

    public static void captureScreenshot(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File srcFile = ts.getScreenshotAs(OutputType.FILE);//FILE return type is file
        File destFile = new File(System.getProperty("user.dir") + "\\src\\main\\java\\org\\alpha\\tejashri\\selenium\\sreenshots\\" + fileName + ".jpg");//appending fileName
        FileUtils.copyFile(srcFile, destFile);
    }
}