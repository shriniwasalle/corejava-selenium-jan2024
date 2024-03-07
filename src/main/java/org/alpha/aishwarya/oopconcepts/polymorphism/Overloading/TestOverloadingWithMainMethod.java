package org.alpha.aishwarya.oopconcepts.polymorphism.Overloading;

public class TestOverloadingWithMainMethod {

    // main method using int parameter
    public static void main(int[] ar) {
        System.out.println("I am in int array main method " + ar);
    }

    public static void main(String[] args) {
        main(new int[]{10, 10, 20});  // data type int Array calling
    }
}


/**
 * Output ----
 * I am in int array main method [I@6aaa5eb0
 */

