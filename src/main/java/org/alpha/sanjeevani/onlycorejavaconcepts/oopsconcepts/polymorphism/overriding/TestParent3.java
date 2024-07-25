package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.polymorphism.overriding;

public class TestParent3 {
    public int m1() {
        return 20;
    }

    public Object m2() {//covariant return type ()String to Object
        return new Object();
    }

    public Number m3() { //covariant return type Short to Number
        return 30;
    }
}
