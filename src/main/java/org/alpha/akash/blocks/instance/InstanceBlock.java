package org.alpha.akash.blocks.instance;

public class InstanceBlock {
    String name;
    {
        name ="Akash";
        System.out.println("I am Instance Block :- 1");
    }


    {
        System.out.println("I am Instance Block :-2");
    }

    public InstanceBlock() {
        int a = 1000;
        int b = 2000;
        System.out.println(a+b);
    }
    {
        System.out.println("I am Instance Block :- 3");
    }

    public  InstanceBlock(int a,int b) {
        System.out.println(a*b);}


    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();//Addition

        InstanceBlock obj1 = new InstanceBlock(10,20);//Multiplication


        //Static Block Are Whenever class run then its call
        // Instance Block are Whenever Object created then its call
    }
}
