package org.alpha.shriniwas.testngconcepts.parameterization;

import org.testng.annotations.Test;

public class TestDataProvider1 {

    @Test
    public void testStringArray() {

        String [] strArr = {"standard_user", "secret_sauce"};

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
    }

    @Test
    public void testObjectArray() {

        Object [] strArr = {"standard_user", 12345, 'A', 100.5};

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
    }

    @Test
    public void testObjectMultiDimensionArray() {

        Object [][] objArr = {
                                {"standard_user", "secret_sauce"},
                                {"locked_out_user", "secret_sauce"},
                                {"standard_user123", "secret_sauce123"}
                              };

        System.out.println(objArr[0][0]); // standard_user
        System.out.println(objArr[0][1]); // secret_sauce

        System.out.println(objArr[1][0]); // locked_out_user
        System.out.println(objArr[1][1]); // secret_sauce

        System.out.println(objArr[2][0]); // locked_out_user
        System.out.println(objArr[2][1]); // secret_sauce
    }
}
