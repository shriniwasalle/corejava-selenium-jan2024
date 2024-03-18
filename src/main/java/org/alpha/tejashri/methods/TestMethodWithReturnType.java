package org.alpha.tejashri.methods;

public class TestMethodWithReturnType {
    int c = 20;
    int d = 20;

    public int addition() {
        int a = 10;
        int b = 20;
        int c = a + b; // 30
        return c; // 30
    }

    public int add() {
        int a = 100;
        int b = 200;
        return a + b + 100; // 400 - directly return
    }

    public int add1() {
        return 200 + 400; // 600
    }

    public int mult1() {
        int c = 10;
        int d = 20;
        return c * d; // 10*20 takes local variables for output
    }

    public int mult2() {
        int c = 10;
        int d = 20;
        return this.c * this.d; // 20*20 wherever 'this' keyword comes then its own class variables/methods will call
    }

    public int mult3(int x, int y) {
        return x * y;
    }

    public String getName() {
        // 'return' used to call from this method to in any other method to do operation on it
        return "Tejashri " + "Aoutomation " + "Student"; // return can hold multiple values

        // return 10; ----->cant use bcoz another 'return' statement in same method.
        /* in 1 method 1 return statement. for multiple return statements
        in same method can possible with 'if else' condition */
    }

    public static void main(String[] args) {
        TestMethodWithReturnType obj = new TestMethodWithReturnType();
        int add = obj.addition(); // stored in other variable add
        System.out.println(add);//30

        int a = obj.mult2();// stored in other variable a
        System.out.println(a);//400

        int xy = obj.mult3(70, 100); //7000, initialised values of x & y here
        System.out.println(xy);

        String ed = obj.getName();// stored in other variable ed
        System.out.println(ed);//Tejashri Aoutomation Student

        System.out.println("---- Return Type 1st way to write ----");
        System.out.println("Addition is: " + add);
        /* or shortcut for above System.out.println("Addition is:" + obj.addition());
         without variable*/

        System.out.println("---- Return Type 2nd way to write ----");
        System.out.println("Addition is: " + a);

        System.out.println("----Return Type 3rd way to write----");
        System.out.println("Addition is: " + ed);

        System.out.println("Multiplication1 is : " + obj.mult1()); // 10*20=200 gives priority local variable valuesSystem.out.println("Multiplication2 is: " +obj.mult2()); // 20*20=400 takes instance variable values
        System.out.println("Multiplication1 is : " + obj.mult2());

        String name = obj.getName(); // Tejashri
        System.out.println("Name is: " + name);
        System.out.println("Length of Name is: " + name.length());
    }
}
