package org.alpha.tejashri.corejava.constructor;

public class TestConstructor3 {
    int age;
    String name;

    public static void main(String[] args) {
        TestConstructor3 obj = new TestConstructor3(); // obj generated default constructor generates automatically
        System.out.println(obj.age); // 0
        System.out.println(obj.name); // null
    }
}

