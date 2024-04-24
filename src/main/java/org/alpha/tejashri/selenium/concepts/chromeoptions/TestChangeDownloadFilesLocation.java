package org.alpha.tejashri.selenium.concepts.chromeoptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestChangeDownloadFilesLocation {
    @Test
    public void verifyChromeOptionsChangeDownloadFilesLocation() {

        //5. To change the location of downloaded file
        Map<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("download.default_directory", "D:\\Automation\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\tejashri\\selenium\\downloadfiles");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://filesamples.com/formats/bmp");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div[1]/a")).click();
        driver.close();
    }
}