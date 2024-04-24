package org.alpha.tejashri.selenium.concepts.actions;

import org.alpha.tejashri.selenium.BaseCodeTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestActions extends BaseCodeTest {

    private static final Logger log = LoggerFactory.getLogger(TestActions.class);
    WebDriver driver;

    @BeforeMethod
    public void init() {
        //1. URl for Right click &
        //2. Double click
        //driver = initBrowser("https://demo.guru99.com/test/simple_context_menu.html", "chrome");

        //3. URL for Drag And Drop
        //driver = initBrowser("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html", "chrome");

        //4. URL for Mouse Hover
        //driver = initBrowser("https://www.flipkart.com/", "chrome");

        //5. URL for keyboard actions
        driver = initBrowser("https://www.saucedemo.com/", "chrome");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    //1.Right click in mouse
    @Test
    public void verifyRightClick() throws InterruptedException {
        //driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        WebElement btnRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        //Create the object of Actions class
        Actions actions = new Actions(driver);

        //contextClick() method used for mouse right click & perform() method used bcz we r performing mouse actions
        //.contextClick(btnRightClick).build().perform();
        //or directly
        actions.contextClick(btnRightClick).perform();

        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        //To Switch to alert box
        Alert al = driver.switchTo().alert();
        Thread.sleep(2000);

        System.out.println("Text of Alert box :  " + al.getText());
        al.accept();
    }

    //2.Left Double-click in mouse
    @Test
    public void verifyDoubleClick() throws InterruptedException {
        WebElement btnDoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions actions = new Actions(driver);

        //doubleClick(wedElement) method used for mouse left Double click
        actions.doubleClick(btnDoubleClick).perform();

        //To Switch to alert box
        Alert al = driver.switchTo().alert();
        Thread.sleep(2000);

        System.out.println("Text of Alert box :  " + al.getText());
        al.accept();
    }

    //3. Drag And Drop with mouse
    @Test
    public void verifyDragDrop() throws InterruptedException {
        Thread.sleep(2000);

        WebElement source = driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement destination = driver.findElement(By.xpath("//div[@id='box103']"));

        Thread.sleep(2000);

        WebElement source1 = driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement destination1 = driver.findElement(By.xpath("//div[@id='box106']"));

        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        //dragAndDrop() method used for drag the element from source place and drop the element in the destination place
        actions.dragAndDrop(source, destination).perform();
        actions.dragAndDrop(source1, destination1).perform();
    }

    //5. Mouse hover with mouse
    @Test
    public void verifyMouseHover() {
        WebElement element = driver.findElement(By.xpath("//img[@alt='Dropdown with more help links']"));

        Actions actions = new Actions(driver);

        //moveToElement() method used for move to that Element /used for mouse hover on that element with mouse
        actions.moveToElement(element).perform();

        driver.findElement(By.xpath("//img[@alt='24x7 Customer Care']")).click();
    }

    //6. Keyboard Actions
    @Test
    public void verifyKeyboardActions() {

        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.id("user-name"));

        actions.keyDown(element, Keys.SHIFT).sendKeys("tejashri").keyUp(Keys.SHIFT).perform();//TEJASHRI
        //doubleClick() method without parameter used for select the word where the cursor is present
        actions.doubleClick().perform();
    }
}