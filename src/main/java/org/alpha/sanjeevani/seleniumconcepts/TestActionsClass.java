package org.alpha.sanjeevani.seleniumconcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class TestActionsClass extends BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void init() throws MalformedURLException {driver = initBrowser("https://demo.guru99.com/test/simple_context_menu.html", "chrome");
    }
   @Test
    public void verifyActionsClass() {
        //Right click
        WebElement btnRightClk = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(btnRightClk).perform();
        driver.findElement(By.xpath("//span[text()='Edit']")).click();
    }
    @Test
    public void verifyDoubleClick() throws InterruptedException {
        //Double click
        WebElement btnDoubleClk = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.doubleClick(btnDoubleClk).perform();
    }
}




