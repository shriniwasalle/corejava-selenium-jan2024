package org.alpha.tejashri.constructor;

public class TestChild extends  TestParent {
    String empName;
    public  TestChild() {
        super();
        System.out.println("Inside TestChild");
    }

 public  TestChild(int age) {
    super("Tejashri"); // super is used to call constructor
     System.out.println(age);
 }

 public TestChild (String name, int age, String empName){
        this(1000);  // this is used to call constructor
        this.empName = empName;
     System.out.println(super.empName); // super is used call to variable
     System.out.println(name);
     System.out.println(age);

 }
 public void TestChild(float f){ // this is a method not constructor b coz
                                // return type void is used in constructor
                                // then it becomes method not constructor


        System.out.println(f);

 }
    public static void main(String[] args) {
        //TestChild obj = new TestChild();
        //TestChild obj1 = new TestChild(10);

        TestChild obj2 = new TestChild("Shri", 100, "xyz");

        obj2.TestChild(10.5f);

        // private TestParent obj = new TestParent('B'); we can not create an object for a private constructor
        }
    }

