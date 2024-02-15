package org.alpha.darshan.methods;

public class TestMethodWithParam {

    public  void  addition(int a, int b){
        int c=a+b;
        System.out.println(c);
    }

    public  int getadd(){
        TestMethodWithReturnType p1= new TestMethodWithReturnType();
        int add1=p1.getaddition(20,30);
        return  add1;
    }

    public void twoadd(){
       //int add3= addition(20,30);
    }
    public static void main(String[] args) {

    TestMethodWithParam p1= new TestMethodWithParam();
    p1.addition(20,30);
     int add2=p1.getadd();
        System.out.println(add2);
    }
}
