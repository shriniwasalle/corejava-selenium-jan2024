package org.alpha.sanjeevani.accessspecifier1;
public class TestAccessSpecifier1 {
    public void m1(){
        System.out.println("I am in m1 method which is public");
    }
    private void m2(){
        System.out.println("I am in m2 method which is private");
    }
    void m3(){
        System.out.println("I am in m3 method which is default");
    }
    protected void m4(){
        System.out.println("I am in m method which is public");
    }

}
