package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfEmployee2 {


    public static void main(String[] args) {

        Employee ee = new Employee("darshan ", 101);
        Employee ee1 = new Employee("darshan1", 102);
        Employee ee2 = new Employee("darshan2", 103);

        List list = new ArrayList();
        list.add(ee);
        list.add(ee1);
        list.add(ee2);

        //System.out.println(list.get(0));

        Employee emp = (Employee) list.get(0);

        System.out.println(emp.empId);
        System.out.println(emp.empName);

        Employee emp1 = (Employee) list.get(1);
        System.out.println(emp1.empName);
        System.out.println(emp1.empId);

        Employee emp2 = (Employee) list.get(2);
        System.out.println(emp2.empName);
        System.out.println(emp2.empId);

        List list2 = new ArrayList();
        list2.add("darshan");
        list2.add(101);
        list2.add(10.5);

        for (Object o : list2) {

            if (o instanceof String) {
                String str = (String) o;
                System.out.println(str.length());
            }
            if (o instanceof Integer) {
                int inrr = (Integer) o;
                System.out.println(inrr);
            }
            if (o instanceof Double) {
                Double dd = (Double) o;
                System.out.println(dd);
            }
        }
    }
}