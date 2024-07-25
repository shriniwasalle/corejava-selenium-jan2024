package org.alpha.sanjeevani.assignment.assignment13.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MethodsPage {
   private final WebDriver driver;
   private final By methodsPath= By.xpath("//div/div/code");
    public MethodsPage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyMethodsPage(){

        List<WebElement> methods=driver.findElements(methodsPath);
        System.out.println("Total no.of Elements:"+methods.size());

        for (int i=0;i<=methods.size()-1;i=i+2){
            System.out.println(methods.get(i).getText()+":"+methods.get(i+1).getText());
        }
    }
}
