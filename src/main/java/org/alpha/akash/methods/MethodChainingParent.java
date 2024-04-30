package org.alpha.akash.methods;

public class MethodChainingParent {

    public void m2(){
        m4();
        System.out.println("I am M2 Methodof parent class");
    }
    public void m4(){
        System.out.println("I am M4 Method of parent class");
    }
}
