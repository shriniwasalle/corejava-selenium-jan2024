package org.alpha.sanjeevani.seleniumconcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
public class ActionsClassForDragAndDrop extends BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void init() throws MalformedURLException {
        driver = initBrowser("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html", "chrome");
    }
    @Test
    public void verifyDragAndDrop(){
        WebElement source=driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement destination=driver.findElement(By.xpath("//div[@id='box103']"));//id="box103"
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,destination).perform();
    }
}
