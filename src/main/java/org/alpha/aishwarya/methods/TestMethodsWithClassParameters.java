package org.alpha.aishwarya.methods;

public class TestMethodsWithClassParameters {

    public void m1(TestEmployee obj , TestEmployee1 obj2){
        System.out.println(obj.empName + obj.empId);
        System.out.println(obj2.emp1Name + obj2.emp1Id );
         obj2.m2();
    }

    public static void main(String[] args) {
        TestEmployee Obj = new TestEmployee();

        TestEmployee1 obj2 = new TestEmployee1();

        TestMethodsWithClassParameters obj1 = new TestMethodsWithClassParameters();
        obj1.m1(Obj , obj2);

    }
}

