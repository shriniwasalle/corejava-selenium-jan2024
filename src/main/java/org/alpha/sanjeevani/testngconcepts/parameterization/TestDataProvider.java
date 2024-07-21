package org.alpha.sanjeevani.testngconcepts.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
    @Test(dataProvider = "getObject2DArrayData")
    public void verifyLogin(String userName,String password,String type){
        System.out.println(userName);
        System.out.println(password);
        System.out.println(type);

    }
    @DataProvider(name = "getObject2DArrayData")
    public Object [][] getObject2DArrayData(){

        Object [][] objArr= {
                {"standard_user", "secret_sauce", "valid"},
                {"locked_out_user", "secret_sauce", "locked_out"},
                {"standard_user123", "secret_sauce123", "invalid"}
        };
                   return objArr;
    }
}
