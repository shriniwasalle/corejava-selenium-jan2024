package org.alpha.sanjeevani.onlycorejavaconcepts.variables;

public class TestStaticVariables1 {
    static int age=24;
    static String name="sanjana";

    //non-static method/instance method we can access directly
    public void m1(){
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        //using classname
        System.out.println(TestStaticVariables1.age);
        System.out.println(TestStaticVariables1.name);
        System.out.println("----------------------");
          //Direct Access
        System.out.println(age);
        System.out.println(name);



    }
}
