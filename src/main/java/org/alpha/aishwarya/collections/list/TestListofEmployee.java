package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListofEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee("SAishwarya", 101);
        Employee emp2 = new Employee("SAishwarya2", 102);

        List list = new ArrayList();
        list.add(emp1); // index = 0
        list.add(emp2); //index 1

        System.out.println("Employee Object Printing Here " + list);
//Output: Employee Object Printing Here [org.alpha.aishwarya.collections.list.Employee@6aaa5eb0, org.alpha.aishwarya.collections.list.Employee@3498ed]

        //Type Casting: Employee Data aanya sati Type casting keala ahe: becz
        Employee e1 = (Employee) list.get(0); // Object -->Employee (Type Casting)
        System.out.println(e1.empName);
        System.out.println(e1.empId);

        Employee e2 = (Employee) list.get(1); // Object -->Employee (Type Casting)
        System.out.println(e2.empName);
        System.out.println(e2.empId);

        List list1 = new ArrayList();
        list1.add("AIshwarya");
        list1.add(100);
        list1.add(15.5);
        list1.add("Aishwarya1");
        System.out.println("List1 Printing " + list1);
        // output:List1 Printing [AIshwarya, 100, 15.5, Aishwarya1]

        System.out.println("----using for Each loop----");
        for (Object value : list1) {
            System.out.println(value);
        }
    }
}

/**
 * ---OutPut-----
 * Employee Object Printing Here [org.alpha.aishwarya.collections.list.Employee@6aaa5eb0, org.alpha.aishwarya.collections.list.Employee@3498ed]
 * SAishwarya
 * 101
 * SAishwarya2
 * 102
 * List1 Printing [AIshwarya, 100, 15.5, Aishwarya1]
 * ----using for Each loop----
 * AIshwarya
 * 100
 * 15.5
 * Aishwarya1
 */

