package org.alpha.darshan.blocks;



public class InsatanceBlock {

    {
        System.out.println("i am in instance block");
    }
    /*instance block executed whenever we create and object but it will execute before the constructor.*/
    public InsatanceBlock(){
        System.out.println("i am in constructor");
    }
    static {
        System.out.println("i am in static block" );//
    }
    public static void main(String[] args) {
        InsatanceBlock b1= new InsatanceBlock();
        //InsatanceBlock b2= new InsatanceBlock();
    }
}
