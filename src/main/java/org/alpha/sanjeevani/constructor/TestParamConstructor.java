package org.alpha.sanjeevani.constructor;

public class TestParamConstructor {
    int EmpId;
    String EmpName;
    //Parameterized constructor
    TestParamConstructor(int EmpId,String EmpName){
       this.EmpId =EmpId;
       this.EmpName =EmpName;
        System.out.println("Emp ID is:"+EmpId);
        System.out.println("Emp name is:"+EmpName);
        }

    public static void main(String[] args) {
        new TestParamConstructor (100,"sanjeevani");
        new TestParamConstructor (200,"sayaji");
        new TestParamConstructor (300,"sutar");
    }
}
