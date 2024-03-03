package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverriding.changingreturntypes;

public class TestChild3MethodOverriding extends TestParent3MethodOverriding {
    @Override
    public int m1() {
        return 10;
    }

    @Override // bcoz String is a Child class of Object class
    // which is parent class of all methods present in child class
    // this is called covariant return type String-> Object
    public String m2() {
        return "Tejashri";
    }

    @Override// bcoz covariant return types Short-> Number
    public Short m3() {
        return 100;
    }

    public static void main(String[] args) {
        TestParent3MethodOverriding obj1 = new TestChild3MethodOverriding();
        System.out.println(obj1.m1()); // child m1 method
        System.out.println(obj1.m2()); // child m2 method
        System.out.println(obj1.m3()); //// child m3 method
    }
}
