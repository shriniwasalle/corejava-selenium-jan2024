package org.alpha.sanjeevani.testngconcepts.parameterization;
import org.testng.annotations.DataProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderValuesClass {
    @DataProvider(name = "getObject2DArrayData")
    public Object [][] getObject2DArrayData(){

        Object [][] objArr= {
                {"standard_user", "secret_sauce", "valid"},
                {"locked_out_user", "secret_sauce", "locked_out"},
                {"standard_user123", "secret_sauce123", "invalid"}};
        return objArr;
    }
    @DataProvider(name = "getIteratorObjectArrayData")
    public Iterator<Object[]> getIteratorObjectArrayData() {

        Object[] objArr1 = {"standard_user", "secret_sauce", "valid"};
        Object[] objArr2 = {"locked_out_user", "secret_sauce", "locked_out"};
        Object[] objArr3 = {"standard_user123", "secret_sauce123", "invalid"};

        List<Object[]> list = new ArrayList<>();
        list.add(objArr1);
        list.add(objArr2);
        list.add(objArr3);

        Iterator<Object[]>itr = list.iterator();
        return itr;
    }
    @DataProvider(name="objectArrayData")
    public Object [] objectArrayData(){
        //return new Object[]{"chrome", "firefox", "edge"};
        Object [] objArr={ "chrome",
                           "firefox",
                            "edge"
        };
             return objArr;
        //
    }
}
