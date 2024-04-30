package org.alpha.akash.oopconcepts.inheritance.hierarchical;

public class Child1 extends ParentAll{

    void getDetails () {
        System.out.println(age); //ParentAll : age 100
        System.out.println(name); //ParentAll : name :Akash
    }

    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.getDetails();
    }

}
