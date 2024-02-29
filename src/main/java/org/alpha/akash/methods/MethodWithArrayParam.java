package org.alpha.akash.methods;

public class MethodWithArrayParam {
    public void getArrayId(int[] empIds){
        System.out.println(empIds[0]);
        System.out.println(empIds[1]);
        System.out.println(empIds[2]);
    }
    public void getName(String [] names){
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }

    public void getName1(String[] names) {
        //for loop
        //using for loop
        for(int i=0;i<= names.length-1;i++) {
            System.out.println(names[i]);//names[0],names[1],names[2]
        }

        //using for each loop
        for(String name : names) System.out.println(name);
    }

    public static void main(String[] args) {
        int [] ids ={100, 101, 102};
        String [] names = {"Akash", "Punit", "Kartik"};
        MethodWithArrayParam obj = new MethodWithArrayParam();
        obj.getArrayId(ids);
        obj.getName(names);
        obj.getName1(names);
    }

}
