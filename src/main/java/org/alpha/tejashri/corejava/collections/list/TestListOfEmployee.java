package org.alpha.tejashri.corejava.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Shri", 100);
        Employee emp2 = new Employee("Mahi", 200);
        Employee emp3 = new Employee("Anshu", 300);

        //Non - generic/Heterogeneous objects/values in list, its not Type Safety
        List list = new ArrayList();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println(list);//will print Ash Codes of that objects
        //[Employee@3ac3fd8b(empName, empId), Employee@5594a1b5, Employee@6a5fc7f7]
        //[Object 1, Object 2, Object 3]

        Employee e1 = (Employee) list.get(0); // (Employee) list.get(0) is Object -> Employee Type Casting
        System.out.println(e1.empName);
        System.out.println(e1.empId);

        Employee e2 = (Employee) list.get(1); // Object -> Employee Type Casting
        System.out.println(e2.empName);
        System.out.println(e2.empId);

        Employee e3 = (Employee) list.get(2); // Object -> Employee Type Casting
        System.out.println(e3.empName);
        System.out.println(e3.empId);

        List list1 = new ArrayList();
        //Non - generic/Heterogeneous objects/values in list1, its not Type Safety
        list1.add("Tejashri"); //String
        list1.add(1000); //integer
        list1.add('X'); // character
        list1.add(99.9f); //float

        //Iteration
        System.out.println("------Using For Each loop-----");
        for (Object value : list1) {
            if (value instanceof String) { //Type checking
                String str = (String) value;// Type Casting, Object -> String
                //Operation on String Value
                System.out.println("Length of String : " + str.length());
            }
            if (value instanceof Integer) {
                Integer id = (Integer) value; // Type Casting, Object -> Integer
                //Operation on Integer Value
                System.out.println("Is 1000 value equals to 2000 : " + id.equals(2000));
            }
            if (value instanceof Character) {
                Character ch = (Character) value; // Type Casting, Object -> Character
                //Operation on Character Value
                System.out.println("Compares two Character objects numerically : " + ch.compareTo('V')); // 2,Compares two Character objects numerically
                //gives a numerical comparison, numerically V comes 2 position before X numerically
                System.out.println(ch.compareTo('T')); //4
                System.out.println(ch.compareTo('X'));//the value 0 if the argument Character is equal to given Character
                System.out.println(ch.compareTo('Y')); // after X so -1
                System.out.println(ch.charValue()); // X
            }
            if (value instanceof Float) {
                //Operation on Float Value
                System.out.println("Float value : " + value);
            }
        }
    }
}