package org.alpha.aishwarya.oopconcepts.polymorphism.Overridding;

public class TestChild4 extends TestParent4 {

    public int m1(){
        return 10;
    }

    public static void main(String[] args) {
       TestParent4 obj1 = new TestChild4();
        //obj1.m1();
        System.out.println(obj1.m1()); // print keal ahe output
    }

/** --- Output---
 * 10 --> Object created of child class
 */


}
