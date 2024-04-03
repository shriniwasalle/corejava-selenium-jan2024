package org.alpha.darshan.methods;

public class TestMethodWithReturnT {



    public int addition(int a,int b){
        int c=a+b;
        return c;
    }
    public  float addition1(float d,float c){
        float s=d+c;
        return s;
    }



    public static void main(String[] args) {
        TestMethodWithReturnT add= new TestMethodWithReturnT();
       int d=add.addition(10,20);
       int e=d-20;
        System.out.println(e);

      float ee=  add.addition1(10.1f,10.3f);

        System.out.println(ee);
    }
}
