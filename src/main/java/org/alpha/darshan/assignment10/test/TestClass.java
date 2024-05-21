package org.alpha.darshan.assignment10.test;

import org.alpha.darshan.assignment10.pages.EmiCalculatorPage;
import org.alpha.darshan.assignment10.utils.ReadPropertiesFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass extends  BaseTest{
    @BeforeMethod
    public void inIt() throws IOException {
        browserInit(ReadPropertiesFile.getPropertyValue("url"),ReadPropertiesFile.getPropertyValue("browser"));
    }

    @Test
    public void calculateEmiA(){
        EmiCalculatorPage emiCalculatorPage= new EmiCalculatorPage(driver);
        emiCalculatorPage.calculateEmi();
    }
}
