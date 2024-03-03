package org.alpha.sanjeevani.oopsconcepts.inheritance;

public class TestChild1 extends TestParent1 {
    int age = 10;

    public void getData() {
        System.out.println(this.age);//10
        System.out.println(id);//200
        System.out.println(super.age);//100
    }

    public static void main(String[] args) {
        ////we can access all TestChild1, TestParent1 and TestGrandParent1 and object class variables and methods
        TestChild1 obj = new TestChild1();
        obj.getData();

//we can access only TestParent1 and TestGrandParent1 variables and methods
        System.out.println("-------------------TestParent1 and TestGrandParent1 variables and methods----------------------------");
        TestParent1 obj1 = new TestParent1();
        System.out.println(obj1.id);//200
        System.out.println(obj1.age);//100

//we can access only TestGrandParent1 and object class variables and methods
        System.out.println("------------TestGrandParent1 variables and methods------------");
        TestGrandParent1 obj2 = new TestGrandParent1();
        System.out.println(obj2.age);//100
    }

}
