package org.alpha.akash.constructor;

public class Child extends Parent {

    String empName;

    public Child() {
        super();
        System.out.println("Inside of Child class");
    }
    public Child(int age) {
       super("Akash");
        System.out.println(age);
    }

    public Child(String name, int age, String empName) {
        this(1000);
        this.empName =empName;
       System.out.println(super.empName);
        System.out.println(name);
        System.out.println(age);
    }
    public void Child(float f) {System.out.println(f);}

    public static void main(String[] args) {
//        Child obj1 = new Child(); //Inside of Child Class
//        Child obj2 = new Child(24); //My Name Is:- Akash,24

        Child obj3 = new Child("Akash", 24,"Akki"); //Akash,25,Akki
        //obj3.Child(10.5f);

       // Parent obj = new Parent('A'); //We can not create an object for a private constructor
    }

}
