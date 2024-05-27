package org.alpha.aishwarya.oopconcepts.inheritance;

public class TestChild extends TestParent{

    int age = 100;

    public void getData(){
        System.out.println(age);
        System.out.println(super.age);
        System.out.println(this.age);
        System.out.println(name);
    }

    public void m1(){
        System.out.println("I am in Test Child method");
        super.m1();
    }

 public static void main(String[] args){
     TestChild obj = new TestChild();
      obj.getData();
      obj.getDetails();
      obj.m1();
    }
}
