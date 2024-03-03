package org.alpha.shriniwas.oopsconcepts.polymorphism.overriding;

public class TestChild2 extends TestParent2 {

    @Override // Annotation
    public void m1() {
        System.out.println("Inside TestChild2 :: m1 method");
    }

    public void m2(String str) {
        System.out.println("Inside TestChild2 :: m1 method" + str);
    }

    public void m3(String str, int age) {
        System.out.println("Inside TestChild2 :: m3 method" + str+age);
    }

    @Override
    public void m3(int age, String str) {
        System.out.println("Inside TestChild2 :: m3 method" + str+age);
    }

    public static void main(String[] args) {
        TestChild2 obj1 = new TestChild2();
        // obj1.m2("Shriniwas");
        obj1.m3("Shriniwas", 100);
        obj1.m4();

        TestParent2 obj2 = new TestChild2();
        // obj2.m2("Shrini");
        obj2.m3(100, "Shrini"); // int, string
        obj2.m4();

        TestParent2 obj3 = new TestParent2();
        // obj3.m2("Shri");
        obj3.m3(200,"Shri");
    }
}
