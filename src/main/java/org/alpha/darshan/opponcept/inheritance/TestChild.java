package org.alpha.darshan.opponcept.inheritance;



public class TestChild extends TestParent {

    public void methodChild(){
        System.out.println(age);
    }

    public  void m2(){
        System.out.println("i am in m2 method");
    }

    public static void main(String[] args) {
        TestChild t1= new TestChild();
        t1.methodChild();
        TestParent p1= new TestChild();
        //p1.m2();
        /*TestParent : reference
        TestChild: object
        bcz we are giving reference of test parent then compiler will check
        is there any method present in TestParent class if not then it will give error*/

    }
}
