package org.alpha.shriniwas.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfEmployees {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Shri1", 100);
        Employee emp2 = new Employee("Shri2", 200);
        Employee emp3 = new Employee("Shri3", 300);

        List list = new ArrayList();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println(list);
        // [Object Employee@6d03e736(empId, empName), Object Employee@568db2f2, Object Employee@378bf509]

        Employee e1 = (Employee) list.get(0); // Object -> Employee : Typecasting
        System.out.println(e1.empName);
        System.out.println(e1.empId);

        Employee e2 = (Employee) list.get(1); // Object -> Employee : Typecasting
        System.out.println(e2.empName);
        System.out.println(e2.empId);

        Employee e3 = (Employee) list.get(2); // Object -> Employee : Typecasting
        System.out.println(e3.empName);
        System.out.println(e3.empId);

        System.out.println("-----------------------------");

        List list1 = new ArrayList();
        list1.add("Shriniwas");
        list1.add(100);
        list1.add(10.5);
        // list1.add(emp1);

        // [Shriniwas, 100]

        for (Object value : list1) {

            // Type Checking
            if(value instanceof String) {
                // Type Casting
                String str = (String) value; // Shriniwas
                System.out.println("Length of String: " + str.length()); // 9
            } if(value instanceof Integer) {
                Integer i = (Integer) value;
                // Operation on Integer value
                System.out.println(i); // 100
            } if(value instanceof Double) {
                // Operation on Double value
                System.out.println("Double Value: "+value); // 10.5
            }
        }
    }
}
