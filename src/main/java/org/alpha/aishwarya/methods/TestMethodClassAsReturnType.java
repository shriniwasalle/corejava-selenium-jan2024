package org.alpha.aishwarya.methods;

public class TestMethodClassAsReturnType {

    public TestEmployee m1 (){ // instead of void obj return type entered
        TestEmployee obj= new TestEmployee(); // TestEmployee class Object
        return obj;
    }


    public void m2(){
       System.out.println("I am in m2 method");
    }


    public static void TestStatic (){System.out.println("i am in Static method ");
    }



    public static void main(String[] args) {

        TestMethodClassAsReturnType obj1 = new TestMethodClassAsReturnType(); // Current class Object

        TestEmployee ee = obj1.m1();  // Value return that's why stored in the

      System.out.println(ee.empName  +  "  "  + ee.empId); // jar fkt ee lihl tr Class address print krto tymul variable pass krav lagl value print krnyasati

        ee.getDetails(); // always refere stored value variable for method calling.

        obj1.m2();   //output: i am in m2 method ===> Current class Method access

       TestMethodClassAsReturnType.TestStatic();
    }


}
/**----OutPut----
 * Jhon Doe  10
 *  I am in Test Employee
 * I am in m2 method
 * i am in Static method
 */