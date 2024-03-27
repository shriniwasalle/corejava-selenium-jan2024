package org.alpha.shriniwas.oopsconcepts.encapsulation;

public class TestingGetterSetters {

    public static void main(String[] args) {
        TestEncapsulation obj = new TestEncapsulation();
        // System.out.println(obj.ssn);

        obj.setSsn("123456789");
        obj.setSsn("1225555");
        obj.setSalary("100000");

        System.out.println(obj.getSsn());
        System.out.println(obj.getSalary());
    }
}
