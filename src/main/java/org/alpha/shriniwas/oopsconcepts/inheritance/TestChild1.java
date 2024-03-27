package org.alpha.shriniwas.oopsconcepts.inheritance;

public class TestChild1 extends TestParent1 {

    int age = 500;

    public void getData() {
        System.out.println(id); // 10
        System.out.println(this.age); // 500
        System.out.println(super.age); // 100
    }

    public static void main(String[] args) {
        TestChild1 obj1 = new TestChild1();
        obj1.getData();

        TestParent1 obj2 = new TestParent1();
        System.out.println(obj2.age); // 100
        System.out.println(obj2.id); // 10

        TestGrandParent1 obj3 = new TestGrandParent1();
        System.out.println(obj3.age);
    }
}
