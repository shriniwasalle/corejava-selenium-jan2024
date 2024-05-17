package org.alpha.tejashri.TestNG.dataproviders;

import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderExample {
    @Test
    public void getDataDynamically() throws IOException {

        //HardCoded values provided here
        Object[][] objArr = new Object[3][3];

        objArr[0][0] = "Shri00";
        objArr[0][1] = "Shri01";
        objArr[0][2] = "Shri02";

        objArr[1][0] = "Shri10";
        objArr[1][1] = "Shri11";
        objArr[1][2] = "Shri12";

        objArr[2][0] = "Shri20";
        objArr[2][1] = "Shri21";
        objArr[2][2] = "Shri22";

        System.out.println(objArr[0][0]);
        System.out.println(objArr[0][1]);
        System.out.println(objArr[0][2]);

        System.out.println(objArr[1][0]);
        System.out.println(objArr[1][1]);
        System.out.println(objArr[1][2]);

        System.out.println(objArr[2][0]);
        System.out.println(objArr[2][1]);
        System.out.println(objArr[2][2]);

    }
}