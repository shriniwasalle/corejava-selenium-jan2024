package org.alpha.akash.oopconcepts.inheritance.hierarchical;

public class Child2 extends ParentAll{

    void getDetails() {

        System.out.println(age); //ParentAll : age 100
        System.out.println(name); //ParentAll : name :Akash
    }

    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.getDetails();
    }
}
