package org.alpha.tejashri.constructor;

public class TestParent {
    String empName = "abcd";

    public TestParent() {
        System.out.println("Inside TestParent");
    }

    public TestParent(String name) {
        System.out.println("My name is " + name);
    }

    private TestParent(char ch) {
        System.out.println(ch);
    }

    protected TestParent(boolean ch) {
        System.out.println(ch);
    }

    TestParent(float f) { /* this is a default constructor accessed directly in same package
                        / not in difft package can't create object*/

        System.out.println(f);
    }

    public TestParent(long l) {
        System.out.println(l);
    }

    //    public static void main(String[] args) {
    //        TestParent obj = new TestParent('A');
    //        }
}