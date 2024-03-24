package org.alpha.tejashri.corejava.accessspecifier1;

public class TestAccessSpecifier1 {
    public void m1() {
        System.out.println("TestAccessSpecifier1 class :: m1 method which is public");
    }

    private void m2() {
        System.out.println("TestAccessSpecifier1 class :: m2 method which is private");
    }

    void m3() {
        System.out.println("TestAccessSpecifier1 class :: m3 method which is default");
    }

    protected void m4() {
        System.out.println("TestAccessSpecifier1 class :: m4 method which is protected");
    }

    public static void main(String[] args) {

    }
}
