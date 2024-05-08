package org.alpha.tejashri.TestNG.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider2 {

    @Test(dataProvider = "getObject2DArrayData")
    public void verifyLogin(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);

    }

    @DataProvider(name = "getObject2DArrayData")
    public Object[][] getObject2DArrayData() {
        Object[][] objArr = {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"standard_user123", "secret_sauce123"},
        };
        return objArr;
    }
}
