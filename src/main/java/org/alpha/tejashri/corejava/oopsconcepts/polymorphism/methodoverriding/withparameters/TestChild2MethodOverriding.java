package org.alpha.tejashri.corejava.oopsconcepts.polymorphism.methodoverriding.withparameters;

public class TestChild2MethodOverriding extends TestParent2MethodOverriding {
    @Override // this annotation gives that same m1 method present in parent class also means Method Overriding
    public void m1() {
        System.out.println("Inside TestChild2MethodOverriding :: m1 method");
    }

    @Override
    public void m2(String str) {
        System.out.println("Inside TestChild2MethodOverriding :: m2 method : " + str);
        super.m4(10.00f); // direct call parent method by super
    }

    public void m3(String ss, int id) {
        // This m3 method is not override
        System.out.println("Inside TestChild2MethodOverriding :: m3 method : " + ss + id);
        this.m4('A'); // direct call child method by this
    }

    // @Override // if this method will present-> this also override with same parameters of parent m3
    // public void m3(int age1, String s1) {
    //     System.out.println("Inside TestChild2MethodOverriding :: m3 method : " + age1+s1);
    //     }
    // above these 2 m3 methods are overloaded in same class with different parameters

    public void m4(char ch) {
        System.out.println("Inside TestChild2MethodOverriding :: m4 method : " + ch);
    }

    public static void main(String[] args) {
        TestChild2MethodOverriding obj1 = new TestChild2MethodOverriding();
        System.out.println();
        obj1.m2("Tejashri"); // child
        obj1.m3("Teja", 1000); // child-String & int method
        obj1.m3(100, "Shri"); //Parent-int & String method bcoz not present in child class
        // but child class can not call in parent class

        TestParent2MethodOverriding obj2 = new TestChild2MethodOverriding();
        System.out.println();
        obj2.m2("Anshika"); // child method bcoz of overriding
        obj2.m3(200, "Anshu"); // Parent -At the Run time, if these type of parameters method not present in child class
        // but present in parent class then called to parent method
        // if present in child class will call to child method

        TestParent2MethodOverriding obj3 = new TestParent2MethodOverriding();
        System.out.println();
        obj3.m2("Mahika"); // Parent
        obj3.m3(300, "Mahi"); //parent
    }
}

//------------------ Output --------------------
//Inside TestChild2MethodOverriding :: m2 method : Tejashri
//Inside TestParent2MethodOverriding :: m4 method : 10.0
//Inside TestChild2MethodOverriding :: m3 method : Teja1000
//Inside TestChild2MethodOverriding :: m4 method : A
//Inside TestParent2MethodOverriding :: m3 method : 100Shri
//
//Inside TestChild2MethodOverriding :: m2 method : Anshika
//Inside TestParent2MethodOverriding :: m4 method : 10.0
//Inside TestParent2MethodOverriding :: m3 method : 200Anshu
//
//Inside TestParent2MethodOverriding :: m2 method : Mahika
//Inside TestParent2MethodOverriding :: m3 method : 300Mahi