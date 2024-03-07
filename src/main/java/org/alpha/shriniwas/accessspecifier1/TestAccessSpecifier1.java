package org.alpha.shriniwas.accessspecifier1;

public class TestAccessSpecifier1 {

    public void m1() {
        System.out.println("In m1 method which is public");
    }

    private void m2() {
        System.out.println("In m2 method which is private");
    }

    void m3() {
        System.out.println("In m3 method which is default");
    }

    protected void m4() {
        System.out.println("In m4 method which is protected");
    }


}
