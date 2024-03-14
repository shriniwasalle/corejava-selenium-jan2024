package org.alpha.darshan.opponcept.abstraction;

public class TestConstructorChild extends TestConstructorParent {


    @Override
    public void m1() {
        System.out.println("i am in m1 method of TestConChild");
    }

    public static void main(String[] args) {
        TestConstructorParent p1= new TestConstructorChild();
        
    }
}
