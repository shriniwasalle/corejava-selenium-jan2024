package org.alpha.aishwarya.oopconcepts.abstraction;

public class TestConstructorInACChild extends TestConstructorInAcParent {
    public TestConstructorInACChild (){ // Constructor calling
        //super();

    }
    @Override
    public void m1(){
        System.out.println("Inside m1 method");
    }

    public static void main(String[] args) {
        TestConstructorInAcParent ref = new TestConstructorInACChild();

    }
}

/**---OUTPUT----
 * Insdie Abstract Class Constructor
 */