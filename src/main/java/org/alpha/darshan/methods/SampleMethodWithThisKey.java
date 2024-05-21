package org.alpha.darshan.methods;

public class SampleMethodWithThisKey {
        int a=200;

        int b=300;

        int c;

        public void addition(){
            int a=10;
            int b=20;
            System.out.println(this.a+this.b);
        }

        public void multiPlication(){
            addition();
            int a=20;
            int b=30;
            System.out.println(a*b);
        }
    public static void main(String[] args) {
    SampleMethodWithThisKey key= new SampleMethodWithThisKey();
    key.multiPlication();
    key.addition();


    }
}
