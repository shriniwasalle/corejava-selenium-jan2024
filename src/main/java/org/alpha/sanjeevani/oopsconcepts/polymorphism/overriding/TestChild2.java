package org.alpha.sanjeevani.oopsconcepts.polymorphism.overriding;

public class TestChild2 extends TestParent2 {
    public void m1(){
        System.out.println("I am in TestChild2 :: m1 method");
    }
    public void m2(String str){
        System.out.println("I am in TestChild2 :: m2 method");
        System.out.println(str);
    }
    public void m3(String st,int age){
        System.out.println("I am in TestChild2 :: m3 method");
        System.out.println(st);
        System.out.println(age);
    }
    public void m3(int age,String st){
        System.out.println("I am in TestChild2 :: m3 method");
        System.out.println(st);
        System.out.println(age);
    }
    public static void main(String[] args) {
        TestChild2 obj=new TestChild2();

        obj.m2("sanjeevani");
        obj.m3("sanju",30);
        System.out.println("                  ");

        TestParent2 obj2=new TestParent2();
        obj2.m2("sayaji");
        obj2.m3(40,"vinu");
        System.out.println("                  ");

        TestParent2 obj3=new TestChild2();
        obj3.m2("shlok");
        obj3.m3(50,"shweta");
    }
}
