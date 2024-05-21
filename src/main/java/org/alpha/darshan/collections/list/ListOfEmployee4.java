package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployee4 {





    public static void main(String[] args) {
        Employee ee1= new Employee("darshn",101);
        Employee ee2= new Employee("darahan1",102);
        Employee ee3= new Employee("darshan2",103);

        List list= new ArrayList<>();
        list.add(ee1);
        list.add(ee2);
        list.add(ee3);

        Employee emp =(Employee) list.get(0);

        System.out.println(emp.empId);
        System.out.println(emp.empName);


        List list2= new ArrayList();
        list2.add("darshan");
        list2.add("darshan2");
        list2.add("darshan3");

        List list3= new ArrayList();
        list3.add("darshan4");
        list3.add("darshan5");
        list3.add("darshan6");

        List<List<String>> list1= new ArrayList<>();
        list1.add(list2);
        list1.add(list3);

        for (List<String> los:list1){
            for (String str:los){
                System.out.println(str);
            }
        }
    }


}
