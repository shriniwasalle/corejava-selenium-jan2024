package org.alpha.akash.accessspecifier1;

public class AccessSpecifier1 {


    public void m1() {
        System.out.println("In m1 method which is public");
    }

    private void m2() {
        System.out.println("In m2 method which is Private");
    }
    void m3() {
        System.out.println("In m3 method which is Default");
    }

    protected void m4() {
        System.out.println("In m4 method which is Protected");
    }

    public static void main(String[] args) {
        AccessSpecifier1 obj = new AccessSpecifier1();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();


    }


}
