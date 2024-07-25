package org.alpha.sanjeevani.onlycorejavaconcepts.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("sanju1", 100);
        Employee emp2 = new Employee("sanju2", 200);
        Employee emp3 = new Employee("sanju3", 300);

        List list = new ArrayList();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);

        Employee ee1 = (Employee) list.get(0);// type casting :object ---->Employee
        System.out.println(ee1.empName);
        System.out.println(ee1.empId);

        Employee ee2 = (Employee) list.get(1);// type casting :object ---->Employee
        System.out.println(ee2.empName);
        System.out.println(ee2.empId);

        Employee ee3 = (Employee) list.get(1);// type casting :object ---->Employee
        System.out.println(ee3.empName);
        System.out.println(ee3.empId);

        System.out.println("---------------------------------------");
        List list1 = new ArrayList();
        list1.add("sanjana");
        list1.add(300);
        list1.add(10.4);

        System.out.println("Element of list1 is:" + list1);

        for (Object value : list1) {

            System.out.println("Element of list1 is:" + value);

            if (value instanceof String) { // type checking
                String str = (String) value;
                System.out.println("Length of String is :" + str.length());
                System.out.println(value);// ClassCastException error thrown for int value
                //Integer cannot be cast to class java.lang.String
            }
            if (value instanceof Integer) { // type checking
                System.out.println("value of integer is:" + value);
            }
            if (value instanceof Double) {
                System.out.println("value of Double is:" + value);
            }
        }

    }
}
