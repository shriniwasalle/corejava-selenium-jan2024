package org.alpha.shriniwas.methods;

public class TestMethodWithArrayParam {


    public void getArrayData(int [] empIds) {
        System.out.println(empIds[0]);
        System.out.println(empIds[1]);
        System.out.println(empIds[2]);
    }

    public void getNames(String [] names) {
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }

    public void getNames1(String [] names) {

        // names = {"Shri1", "Shri2", "Shri3"};

        // for loop
        System.out.println(" ---- Using For Loop --- ");
        for (int i = 0; i <= names.length-1 ; i++) {
            System.out.println(names[i]); // names[0], names[1], names[2]
        }

        System.out.println(" ---- Using For Each Loop --- ");
        for(String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        int [] ids = {100, 200, 300}; // 0=100, 1=200, 2=300
        // System.out.println(ids);
//        System.out.println(ids[0]);
//        System.out.println(ids[1]);
//        System.out.println(ids[2]);
        // System.out.println(ids[3]); ArrayIndexOutOfBoundsException

        String [] names = {"Shri1", "Shri2", "Shri3"};

        TestMethodWithArrayParam obj = new TestMethodWithArrayParam();
        obj.getArrayData(ids);
        obj.getNames(names);
        obj.getNames1(names);
    }
}
