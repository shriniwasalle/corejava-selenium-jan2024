package org.alpha.tejashri.TestNG.dataproviders;

import org.testng.annotations.Test;

public class TestDataProvider1 {
    @Test
    public void testStringArray() {
        String[] strArr = {"standard_user", "secret_sauce"};
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
    }

    @Test
    public void testObjectArray() {
        Object[] objArr = {"standard_user", 'A', 12345, 100.5};
        System.out.println(objArr[0]);
        System.out.println(objArr[1]);
        System.out.println(objArr[2]);
        System.out.println(objArr[3]);
    }

    @Test
    public void testObjectMultiDimensionArray() {
        Object[][] objArr = {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"standard_user123", "secret_sauce123"},
        };
        System.out.println(objArr[0][0]);
        System.out.println(objArr[0][1]);
        System.out.println(objArr[1][0]);
        System.out.println(objArr[1][1]);
        System.out.println(objArr[2][0]);
        System.out.println(objArr[2][1]);
    }
}
