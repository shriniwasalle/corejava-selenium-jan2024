package org.alpha.tejashri.TestNG.dataproviders;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderValuesClass {

    @DataProvider(name = "getObjectArrayData")
    public Object[] getObjectArrayData() {

        //With storing in another variable
        Object[] objArr = {
                "chrome",
                "firefox",
                "edge",
        };

        return objArr;
    }

    @DataProvider(name = "getObject2DArrayData")
    public Object[][] getObject2DArrayData() {

        //With storing in another variable
        Object[][] objArr = {
                {"standard_user", "secret_sauce", "valid"},
                {"locked_out_user", "secret_sauce", "locked_out"},
                {"standard_user123", "secret_sauce123", "invalid"},
                {"problem_user", "secret_sauce", "problem"},
                {"performance_glitch_user", "secret_sauce", "performance"},
                {"error_user", "secret_sauce", "error"},
                {"visual_user", "secret_sauce", "visual"},
        };
        return objArr;

        //Without storing in another variable
//        return new Object[][]{
//                {"standard_user", "secret_sauce", "valid"},
//                {"locked_out_user", "secret_sauce", "locked_out"},
//                {"standard_user123", "secret_sauce123", "invalid"},
//                {"problem_user", "secret_sauce", "problem"},
//                {"performance_glitch_user", "secret_sauce", "performance"},
//                {"error_user", "secret_sauce", "error"},
//                {"visual_user", "secret_sauce", "visual"},
//        };

    }

    @DataProvider(name = "getIteratorObject2DArrayData")
    public Iterator<Object[]> getIteratorObject2DArrayData() {

        //With storing in another variable
        Object[] objArr1 = {"standard_user", "secret_sauce", "valid"};
        Object[] objArr2 = {"locked_out_user", "secret_sauce", "locked_out"};
        Object[] objArr3 = {"standard_user123", "secret_sauce123", "invalid"};

        List<Object[]> list = new ArrayList<>();
        list.add(objArr1);
        list.add(objArr2);
        list.add(objArr3);

        //Without storing in another variable
//        list.add(new Object[]{"standard_user", "secret_sauce", "valid"});
//        list.add(new Object[]{"locked_out_user", "secret_sauce", "locked_out"});
//        list.add(new Object[]{"standard_user123", "secret_sauce123", "invalid"});

        //With storing in another variable
        Iterator<Object[]> itr = list.iterator();
        return itr;

        //Without storing in another variable
//        return list.iterator();

    }
}
