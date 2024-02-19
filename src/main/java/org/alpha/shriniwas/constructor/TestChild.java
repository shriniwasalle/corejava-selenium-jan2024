package org.alpha.shriniwas.constructor;

public class TestChild extends TestParent {

    String empName;

    public TestChild() {
        super();
        System.out.println("Inside TestChild");
    }

    public TestChild(int age) {
        super("Shri");
        System.out.println(age);
    }

    public TestChild(String name, int age, String empName) {
        this(1000);
        this.empName = empName;
        System.out.println(super.empName);
        System.out.println(name);
        System.out.println(age);
    }

    public void TestChild(float f) {
        System.out.println(f);
    }

    public static void main(String[] args) {
        // TestChild obj = new TestChild();
        // TestChild obj1 = new TestChild(10);

        TestChild obj2 = new TestChild("Shrini", 100, "XYZ");
        obj2.TestChild(10.5f);
        // TestParent obj = new TestParent('B'); We can not create an Object for a private constructor
    }
}
