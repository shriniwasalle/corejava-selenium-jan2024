package org.alpha.darshan.methods;

public class TestMethodWithLocalVar {

    int a=10;

    int b=10;

    public void localVariable(){
        int a=100;
        int b=200;
        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }


    public static void getdetail(){

        int a=10;
        System.out.println("i am in static method");
    }
    public String getlength(){
        return "Darshan";
    }

    static public void main(String[] args) {
        TestMethodWithLocalVar p1= new TestMethodWithLocalVar();
        p1.localVariable();
        String name=p1.getlength();
        System.out.println(name);
        System.out.println(name.length());
        TestMethodWithLocalVar.getdetail();
    }

}
