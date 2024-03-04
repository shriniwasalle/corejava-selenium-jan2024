package org.alpha.darshan.custructors;

public class TestChild1 extends TestParent1 {

    String empName;

    int a;
    public  TestChild1(){
        System.out.println("I am In test Child custructor");
    }
    public TestChild1(int age,String name){
        empName=name;
        a=age;
        System.out.println(empName);
        System.out.println(a);
    }


    public static void main(String[] args) {
//        TestChild1 t1= new TestChild1();
        TestChild1 t2=new TestChild1(10,"darshan");
        TestParent1 t3= new TestParent1();

    }
}
