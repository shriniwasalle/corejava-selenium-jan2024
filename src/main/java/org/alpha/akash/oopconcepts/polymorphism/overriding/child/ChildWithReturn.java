package org.alpha.akash.oopconcepts.polymorphism.overriding.child;

import org.alpha.akash.oopconcepts.polymorphism.overriding.parent.ParentWithReturn;

public class ChildWithReturn  extends ParentWithReturn {

    @Override
    public int m1() { return 100;}
    @Override
    public Short m2() { return 10;}

    public static void main(String[] args) {
        ParentWithReturn obj = new ChildWithReturn();
        System.out.println(obj.m1());
        System.out.println(obj.m2());

    }
}
