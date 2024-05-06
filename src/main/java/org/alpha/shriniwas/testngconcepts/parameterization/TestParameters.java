package org.alpha.shriniwas.testngconcepts.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

    @Test
    @Parameters({"username", "password"})
    public void verifyLogin(String userName, String password) {
            System.out.println(userName); // standard_user
            System.out.println(password); // secret_sauce
    }
}
