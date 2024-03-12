package org.alpha.tejashri.oopsconcepts.encapsulation;

public class TestingGettersSetter {
    public static void main(String[] args) {
        TestEncapsulation obj = new TestEncapsulation();
        obj.setSsn("123456789");
        obj.setSalary("1000000");

        //System.out.println(obj.ssn); //ssn has private access in TestEncapsulation can not access directly

        System.out.println(obj.getSalary());
        System.out.println(obj.getSsn());
    }
}
