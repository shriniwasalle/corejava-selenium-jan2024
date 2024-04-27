package org.alpha.shriniwas.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestActionsClass extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void init() throws MalformedURLException {
       // driver = initBrowser("https://demo.guru99.com/test/simple_context_menu.html", "chrome");
       //  driver = initBrowser("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html", "chrome");
       // driver = initBrowser("https://www.flipkart.com/", "chrome");
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }

    @Test
    public void verifyRightClick() {

        WebElement btnRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions actions = new Actions(driver);

        // Right Click
        actions.contextClick(btnRightClick).perform();

        driver.findElement(By.xpath("//span[text()='Edit']")).click();

    }

    @Test
    public void verifyDoubleClick() {
        WebElement btnDoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions actions = new Actions(driver);

        // Right Click
        actions.doubleClick(btnDoubleClick).perform();
    }

    @Test
    public void verifyDragAndDrop() {

        WebElement source = driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement destination = driver.findElement(By.xpath("//div[@id='box103']"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(source, destination).perform();
    }

    @Test
    public void mouseHover() {
        WebElement element = driver.findElement(By.xpath("//img[@alt=\"Dropdown with more help links\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    @Test
    public void keyboardAction() {
        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.id("user-name"));
        actions.keyDown(element, Keys.SHIFT).sendKeys("shriniwas").keyUp(Keys.SHIFT).perform();

        actions.doubleClick().perform();
    }
}
