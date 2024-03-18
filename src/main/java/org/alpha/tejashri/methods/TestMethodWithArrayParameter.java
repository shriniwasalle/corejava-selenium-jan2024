package org.alpha.tejashri.methods;

public class TestMethodWithArrayParameter {

    public void getArrayData(int[] empIds) {

        System.out.println("---- Employee IDs ----");
        System.out.println(empIds[0]);
        System.out.println(empIds[1]);
        System.out.println(empIds[2]);
    }

    public void getNames(String[] names) {
        // without using  any loops with a simple println
        System.out.println("---- Employee Names ----");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }

    public void getNames1(String[] names) {
        // names = {"Shri1", "Shri2", "Shri3"};
        // using for loop
        System.out.println("---- Using For Loop ----");
        for (int i = 0; i <= names.length - 1; i++) {
            //we can use this also
            //for (int i=0; i<=2; i++)
            //bcz only 3 names are there*/
            // name.length= 3 there -1 means 2 index value i.e. 0,1,2

            System.out.println(names[i]); // names[0], names[1], names[2]
        }

        System.out.println(" ---- Using For Each Loop ---");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        int[] ids = {100, 200, 300}; // will print 0=100, 1=200, 2=300

        // System.out.println(ids);
        // System.out.println(ids[0]);
        // System.out.println(ids[1]);
        // System.out.println(ids[2]);
        // System.out.println(ids[3]); ---> gives error: Array Index Out Of Bounds Exception

        String[] names = {"Shri", "Shri2", "Shri3"};

        TestMethodWithArrayParameter obj = new TestMethodWithArrayParameter();
        obj.getArrayData(ids);
        obj.getNames(names);
        obj.getNames1(names);
    }
}
