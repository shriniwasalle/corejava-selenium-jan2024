package org.alpha.aishwarya.accessspecifier1;

public class TestAccessSpecifier1 {

    public void m1(){
        System.out.println("Inside method m1: which is Public");
    }

    private void m2(){
        System.out.println("Inside method m2: which is Private");
    }

    void m3(){
        System.out.println("Inside method m3: which is Default");
    }

    protected void m4(){ //inside and outside the class -> use inheritance
        System.out.println("Inside method m4: which is Protected");
    }
}
