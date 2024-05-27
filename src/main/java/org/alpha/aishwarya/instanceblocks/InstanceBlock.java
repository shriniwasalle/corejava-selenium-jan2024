package org.alpha.aishwarya.instanceblocks;

public class InstanceBlock {
     //Instance Block
    {
        System.out.println("I am learning Instance blocks");
    }

    public InstanceBlock(){
        int a= 10;
        int b= 20;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        System.out.println("--------------------");
        InstanceBlock obj1 = new InstanceBlock();
    }
}
