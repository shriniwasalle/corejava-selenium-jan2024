package org.alpha.aishwarya.oopconcepts.polymorphism.Overloading;

public class TestOverloadingConstructor {

    public TestOverloadingConstructor (int age){
        System.out.println("I am in int parameter constructor " + age);
    }

    public TestOverloadingConstructor(String str){
        System.out.println("I am in String parameter constructor" + str);
    }

    public static void main(String[] args) {
        new TestOverloadingConstructor(10); // nameless constructor calling
        new TestOverloadingConstructor("Shree Ram");
    }
}



//----Output----
/** I am in int parameter constructor 10
 *  I am in String parameter constructorShree Ram
 */


