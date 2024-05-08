package org.alpha.tejashri.TestNG.parameterizations;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestOptionalParameters {
    @Test
    @Parameters({"browser"})
    //if run this method from this class then it will take the browser key value as a firefox,
    //bcz @Optional("firefox") provided here it will take @Optional value (instead of from xml file)
    //if run this method from xml file then it will take chrome as a value
    //bcz browser key value in xml file is as a chrome (instead of from this class  @Optional value)
    public void verify(@Optional("firefox") String browser) {
        System.out.println(browser);
    }
}
