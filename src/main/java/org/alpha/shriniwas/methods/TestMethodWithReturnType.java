package org.alpha.shriniwas.methods;

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

        return a+b; // 300
    }

    public int add1() {
        return 200+400; // 600
    }

    public int multi1() {
        int c = 10;
        int d = 20;
        return c * d; // 10*20
    }

    public int multi2() {
        int c = 10;
        int d = 20;
        return this.c * this.d; // 20*20
    }

    public String getName() {
        return "Shriniwas" + "Automation" + "Trainer";
    }



    public static void main(String[] args) {
        TestMethodWithReturnType obj = new TestMethodWithReturnType();
        int add = obj.addition();
        int a = obj.add();
        int ad = obj.add1();
        System.out.println("Addition is : " +add);
        System.out.println("Addition is : " +a);
        System.out.println("Addition is : " +ad);

        System.out.println("Multiplication is : " + obj.multi1());
        System.out.println("Multiplication is : " + obj.multi2());

        String name = obj.getName(); // Shriniwas

        System.out.println("Name is : " +name);
        System.out.println("Length of Name is : " +name.length());
    }
}
