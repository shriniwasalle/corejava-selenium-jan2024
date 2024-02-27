package org.alpha.shriniwas.constructor;

public class TestParent {

    String empName = "ABCD";

    public TestParent() {
        System.out.println("Inside TestParent");
    }

    public TestParent(String name) {
        System.out.println("My name is "+name);
    }

    private TestParent(char ch) {
        System.out.println(ch);
    }

    protected TestParent(boolean ch) {
        System.out.println(ch);
    }

    TestParent(float f) {
        System.out.println(f);
    }

    public TestParent(long l) {
        System.out.println(l);
    }

//    public static void main(String[] args) {
//        TestParent obj = new TestParent('A');
//    }

}
