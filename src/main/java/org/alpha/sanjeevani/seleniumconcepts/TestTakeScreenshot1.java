package org.alpha.sanjeevani.seleniumconcepts;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class TestTakeScreenshot1 extends BaseTest{
    WebDriver driver;
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver=initBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","chrome");
    }
    @Test
    public void verifyScreenshot1() throws IOException {
        Date currentDateTime=new Date();
        System.out.println("Before dateTime is:"+currentDateTime);

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
        String dateTime=simpleDateFormat.format(currentDateTime);
        System.out.println("After dateTime is:"+dateTime);

        TakesScreenshot ts=(TakesScreenshot) driver;
        /*File srcFile=ts.getScreenshotAs(OutputType.FILE);
        File destFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\org\\alpha\\sanjeevani\\seleniumconcepts\\screenshots\\Test_"+dateTime+".jpg");
        FileUtils.copyFile(srcFile,destFile);
        */

       /* String base64Str=ts.getScreenshotAs(OutputType.BASE64);
        System.out.println(base64Str);
        byte[]byteArr= Base64.getDecoder().decode(base64Str);
        FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\alpha\\sanjeevani\\seleniumconcepts\\screenshots\\Test_"+dateTime+".jpg");
        fos.write(byteArr);
        fos.close();
    */
        byte[]byteStr= ts.getScreenshotAs(OutputType.BYTES);
        FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\alpha\\sanjeevani\\seleniumconcepts\\screenshots\\Test_"+dateTime+".jpg");
        fos.write(byteStr);
        fos.close();
    }
}
