package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfEmployee3 {


    public static void main(String[] args) {

        Employee1 emp= new Employee1("darshan",101);
        Employee1 emp2= new Employee1("darshan1",102);
        Employee1 emp3= new Employee1("darshan2",103);

        List<Employee1> list = new ArrayList();
        list.add(emp);
        list.add(emp2);
        list.add(emp3);

       Employee1 ee=(Employee1) list.get(0);
        System.out.println(ee.empId);
        System.out.println(ee.empName);

       Employee1 ee2= (Employee1) list.get(1);
        System.out.println(ee2.empName);
        System.out.println(ee2.empId);

        Employee1 ee3= (Employee1) list.get(2);
        System.out.println(ee3.empName);
        System.out.println(ee3.empId);
    }
}
