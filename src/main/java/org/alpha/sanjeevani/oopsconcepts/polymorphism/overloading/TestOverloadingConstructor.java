package org.alpha.sanjeevani.oopsconcepts.polymorphism.overloading;

public class TestOverloadingConstructor {
    public TestOverloadingConstructor(int age){
        System.out.println("I am in int param constructor :"+ age);

    }
    TestOverloadingConstructor(String str){
        System.out.println("I am in String param constructor :"+str);
    }
    public static void main(int[] args){
        System.out.println("I am in int array main method :"+args);

    }
    public static void main(String[] args) {
        new TestOverloadingConstructor(100);
        new TestOverloadingConstructor("sanjeevani");

       // main(new int[] {10,20,30}); directly initialized array
        int[]arr={10,20,30};
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        main(arr);
    }
}
