package org.alpha.darshan.methods;

public class TestMethodWithReturnType {

    public int getaddition(int a, int b){

        int c=a+b;

        return c;
    }

    public int getaddition1(){
        int add= getaddition(20,30);

        return add-1;
    }

    public static void main(String[] args) {
        TestMethodWithReturnType p1= new TestMethodWithReturnType();
         int addition=p1.getaddition(20,30);
        System.out.println(addition);
        int addition2=p1.getaddition1();
        System.out.println(addition2);

    }
}
