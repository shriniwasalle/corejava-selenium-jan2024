package org.alpha.darshan.opponcept.encapsultation;

public class TestGetterSetter {


    public static void main(String[] args) {
        TestEncapsulationExample enc1= new TestEncapsulationExample();
        enc1.setAge(30);
        System.out.println(enc1.getage());

        TestEncapsulation1 enc2= new TestEncapsulation1();
        enc2.setComName("Microsoft");
        System.out.println(enc2.getComName());
    }
}
