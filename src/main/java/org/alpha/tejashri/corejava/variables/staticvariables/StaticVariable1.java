package org.alpha.tejashri.corejava.variables.staticvariables;

public class StaticVariable1 {

    static int age = 100;
    static String name = "Tejashri";

// Instance Method / Non-Static Method
public void m1() {
   // 2. By Direct Access
        System.out.println("instance / Non-Static variables accessed by direct");
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        // Static Method
// 1. by using class name
        System.out.println("Static variables accessed by using class name");
        System.out.println(StaticVariable1.age); // by using class name
        System.out.println(StaticVariable1.name); // by using class name

        // 2. by direct
        System.out.println("Static variables accessed by direct");
        System.out.println(age);
        System.out.println(name);

        // 3. by object creation
        System.out.println("Static variables accessed by object creation");
        StaticVariable1 obj1 = new StaticVariable1();
        System.out.println(obj1.age);
        System.out.println(obj1.name);
    }
}
