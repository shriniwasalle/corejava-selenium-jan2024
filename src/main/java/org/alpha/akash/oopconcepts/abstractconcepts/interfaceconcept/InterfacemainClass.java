package org.alpha.akash.oopconcepts.abstractconcepts.interfaceconcept;

import org.alpha.shriniwas.oopsconcepts.abstraction.interfaceconcept.TestInterface1;

public class InterfacemainClass implements  Interface1, Interface2 {

    @Override
    public void m1(){
        System.out.println("I am M1() method");
    }

    @Override
    public void m2(){
        System.out.println("I am M2() method");
    }

    @Override
    public void m3(){
        System.out.println("I am M3() method");
    }

    @Override
    public void m5(){
        System.out.println("I am M5() method");
    }

    @Override
    public void m6(){
        System.out.println("I am M6() method");
    }

    @Override
    public void m7(){
        System.out.println("I am M7() method");
    }

    @Override
    public void m8(){
        System.out.println("I am M8() method");
    }

       @Override
    public void m10(){
        System.out.println("I am M10() method");
    }


    public static void main(String[] args) {
        Interface1 obj1 = new InterfacemainClass();

        obj1.m1();
        obj1.m2();
        obj1.m3();
        obj1.m5();

        obj1.defauldMethod1();
        Interface1.m9();

        // Interface1.str = "Xyz"; Can not reassign a final variable
        obj1.m7();
        obj1.m10();

        System.out.println(Interface1.strname);



        Interface2 obj2 = new InterfacemainClass();

        obj2.m6();
        obj2.defaultmethod2();
        obj2.m7();
        obj2.m8();
    }

}
