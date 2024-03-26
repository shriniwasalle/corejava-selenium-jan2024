package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListGeneric {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList();
        list1.add("darshan");
        list1.add("darshan2");
        list1.add("darshan3");

        for (String str : list1) {
            System.out.println(str);
        }
        System.out.println("-------------for each loop-----------");
        for (int i = 0; i <= list1.size() - 1; i++) {
            System.out.println(list1.get(i));
        }

        Employee ee = new Employee("darshan ", 101);
        Employee ee1 = new Employee("darshan1", 102);
        Employee ee2 = new Employee("darshan2", 103);

        List<Employee> emp = new ArrayList();
        emp.add(ee);
        emp.add(ee1);
        emp.add(ee2);

        for (Employee eeee : emp) {
            System.out.println(eeee.empId);
            System.out.println(eeee.empName);
        }
    }
}
