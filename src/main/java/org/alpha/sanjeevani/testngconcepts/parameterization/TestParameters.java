package org.alpha.sanjeevani.testngconcepts.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
    @Test
    @Parameters({"UserName","Password","condition"})
    public void verifyLogin(String UserName,String Password,String condition){
        System.out.println(UserName);
        System.out.println(Password);
        System.out.println(condition);
    }
}
