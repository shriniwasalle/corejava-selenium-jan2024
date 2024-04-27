package org.alpha.shriniwas.seleniumconcepts;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class TestTakeScreenshot extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("https://google.com/", "chrome");
    }

    @Test
    public void verifyScreenshots() throws IOException {

        Date currentDateTime = new Date();
        System.out.println("Before Format:: " + currentDateTime);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss"); //2024-04-16-21-45-39

        String dateTime = simpleDateFormat.format(currentDateTime);

        System.out.println("After Format:: " + dateTime);

        captureScreenshot(driver, "Automation_"+dateTime); // fileName = Test_2024-04-16-10-01-57

//        // 2. BASE64
//        String base64Str = ts.getScreenshotAs(OutputType.BASE64);
//        System.out.println(base64Str);
//        byte [] byteArray = Base64.getDecoder().decode(base64Str); // to covert string to byte []
//        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\alpha\\shriniwas\\seleniumconcepts\\screenshots\\Test_"+dateTime +".jpg");
//        fos.write(byteArray);
//        fos.close();

        // 3. BYTES
//        byte[] byteArray = ts.getScreenshotAs(OutputType.BYTES);
//        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\java\\org\\alpha\\shriniwas\\seleniumconcepts\\screenshots\\Test_" + dateTime + ".jpg");
//        fos.write(byteArray);
//        fos.close();
    }

    public static void captureScreenshot(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File( System.getProperty("user.dir")+"\\src\\main\\java\\org\\alpha\\shriniwas\\seleniumconcepts\\screenshots\\"+fileName+".jpg");
        FileUtils.copyFile(srcFile, destFile);
    }
}
