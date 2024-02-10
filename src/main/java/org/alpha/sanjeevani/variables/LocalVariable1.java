package org.alpha.sanjeevani.variables;

public class LocalVariable1 {
    //----------------block level local variable-------------
    {
        int a=200;
        System.out.println(a);
    }
    //---------------constructor(local variable) same as class name---------------
    LocalVariable1(){
        int [] b={20,30,30,40};
        System.out.println(b[2]);
    }
    public void m1(String str){    //---parameter also a local variable---------
        System.out.println(str);
    }
    public static void main(String[] args) {
        //object creation
         LocalVariable1 obj=new LocalVariable1();
        obj.m1("Sanjeevani");

        int age=52;                         //-----------local variable-------
        String name="Vedant";
        System.out.println(age);
        System.out.println(name);
    }
}
