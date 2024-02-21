package org.alpha.tejashri.methods;

public class TestMethodWithLocalVariable {

    // Instance Variables in class are in pink colors
    int a = 10;
    int b = 20;
    int c = 30;
public void m1(){
    // Local variables (in white color) in methods updated the instance variable values
    int a = 100;
    int b = 200;
    System.out.println(a+b); // 100+200 = 300//
                            /* same variables in instance &
                             local but gives 1st priority gives to local*/

    System.out.println(c); // c=30 Instance variable will print
    System.out.println(a+b); //300 given priority to local same as above
    System.out.println(this.a + this.b); // 'this' keyword reffer to current class
                                        // takes instance variable will print 30

}
public void m2() {
    // instance variables a b updated the values here
  a  = 100;
  b = 200;
    System.out.println(a + b); // 300,
}
public void m3(int a, int b){ // local variables
    System.out.println(a + b); //50
    System.out.println(this.a + this.b); // 30

}

    public static void main(String[] args) {
//        TestMethodWithLocalVariable obj = new TestMethodWithLocalVariable();
//        obj.m1();
//        or use

        // Nameless object creation
        new TestMethodWithLocalVariable ().m1(); // use this 1 or 2 methods call
        new  TestMethodWithLocalVariable ().m2();
        new  TestMethodWithLocalVariable ().m3(20, 30);

}

}
