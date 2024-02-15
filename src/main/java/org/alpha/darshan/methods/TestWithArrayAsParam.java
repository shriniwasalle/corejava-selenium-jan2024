package org.alpha.darshan.methods;

public class TestWithArrayAsParam {

    public void getNane(String [] names){
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
    public static void main(String[] args) {
        TestWithArrayAsParam arr= new TestWithArrayAsParam();
        String[] names = {"DARSHAN", "DARSHAN1", "DARSHAN2"};
        arr.getNane(names);
        
    }
}
