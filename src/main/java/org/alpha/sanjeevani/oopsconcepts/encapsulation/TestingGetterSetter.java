package org.alpha.sanjeevani.oopsconcepts.encapsulation;

public class TestingGetterSetter {
    public static void main(String[] args) {
        TestEncapsulation ref=new TestEncapsulation();
        ref.SetSsn("123 456 678");//this.ssn = 123 456 678;
        System.out.println(ref.getSsn());
        ref.setSalary("20 lac");//this.salary = 20 lac;
        System.out.println(ref.getSalary());
    }
}
