package org.alpha.akash.oopconcepts.abstractconcepts.abstractconcept;

public class ConstructorInAC extends ConstructorInAcParent{

    @Override
    public void m1() {
        System.out.println("I am M1 method ");
    }

    public static void main(String[] args) {
        ConstructorInAcParent  ref =  new ConstructorInAC();

    }

}
