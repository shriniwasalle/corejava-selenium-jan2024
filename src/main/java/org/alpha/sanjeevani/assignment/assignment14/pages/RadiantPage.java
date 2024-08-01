package org.alpha.sanjeevani.assignment.assignment14.pages;
import org.alpha.sanjeevani.assignment.assignment14.pageaction.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class RadiantPage {
    WebDriver driver;
    PageActions actions;
   private final By selectProduct=By.xpath("//img[@alt='Radiant Tee']");
   private final By selectSize=By.id("option-label-size-143-item-167");
   private final By selectColor=By.xpath("//div[@class='swatch-option color'][2]");
   private final By btn=By.xpath("//span[text()='Add to Cart']");
   private final By btnCart = By.xpath("//a[@class='action showcart']");
    private final By checkOutBtn = By.xpath("//span[@class='counter-number']");
    private  final By productName = By.xpath("//*[@id='mini-cart']/li/div/div/strong/a");
   private  final By productPrice =By.xpath("//div[@id='minicart-content-wrapper']/div/div/div/span/span");
    private  final By btnProceedToChkOut =By.id("top-cart-btn-checkout");

   //[id="top-cart-btn-checkout"]

    public RadiantPage(WebDriver driver){
      this.driver=driver;
      actions=new PageActions(driver);
  }
  public void verifyRadiantPage() throws InterruptedException {
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      actions.clickOnElement(selectProduct);
      actions.clickOnElement(selectSize);
      actions.clickOnElement(selectColor);
      actions.clickOnElement(btn);
      actions.clickOnElement(btnCart);
      WebElement printProductName =driver.findElement(productName);

      System.out.println("Name of Product is :"+printProductName.getText());
      WebElement printProductPrice = driver.findElement(productPrice);

      System.out.println("Price of Product is :"+printProductPrice.getText());
      actions.clickOnElement(checkOutBtn);
      actions.clickOnElement(btnProceedToChkOut);
  }
}
