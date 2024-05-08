package org.alpha.tejashri.TestNG.parameterizations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

    @Test
    @Parameters({"username", "password"}) //can pass only keys not valves
    public void verifyLogin(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);
    }
}