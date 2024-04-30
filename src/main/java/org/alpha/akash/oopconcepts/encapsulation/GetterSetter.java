package org.alpha.akash.oopconcepts.encapsulation;

import org.alpha.akash.oopconcepts.encapsulation.Encapsulation;

public class GetterSetter {

    public static void main(String[] args) {
        Encapsulation obj1 = new Encapsulation();
//         System.out.println(obj1.ssn);//like this type of private variable can not access
        obj1.setSsn("123456789");
        obj1.setSalary("1234567890");
        obj1.setSsn("123456");

        System.out.println(obj1.getSsn());
        System.out.println(obj1.getSalary());
    }
}
