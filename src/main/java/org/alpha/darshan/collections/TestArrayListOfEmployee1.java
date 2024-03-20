package org.alpha.darshan.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListOfEmployee1 {

    public static void main(String[] args) {
        Employee ee1 = new Employee("darshan", 101);
        Employee ee2 = new Employee("gaikwad", 102);
        Employee ee3 = new Employee("darshan1", 103);

//        System.out.println(ee1.empId);
//        System.out.println(ee1.empName);
        List list = new ArrayList();
        list.add(ee1);
        list.add(ee2);
        list.add(ee3);

        Employee ee = (Employee) list.get(0);//object to employee list.get will return object we need to convert it to employee
        System.out.println(ee.empName);
        System.out.println(ee.empId);

        List list1 = new ArrayList();
        list1.add("darshan");
        list1.add(101);
        list1.add("gaikwad");

        for (Object o : list1) {
            System.out.println(o);//we can directly print the list but if we want to perform some oprations then need to do type
            //casting
            //suppose i want to find the length of the string bcz o is object variable in object
            //class there is no any length method present then we need to convert object class into string
            if (o instanceof String) {
                String str = (String) o;
                System.out.println(str.length());

            }
            if (o instanceof Integer) {
                int i = (Integer) o;
                System.out.println(i);
            }
        }
    }
}
