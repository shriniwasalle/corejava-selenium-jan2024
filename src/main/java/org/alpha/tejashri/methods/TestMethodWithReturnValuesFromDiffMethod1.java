package org.alpha.tejashri.methods;

public class TestMethodWithReturnValuesFromDiffMethod1 {
     public String getName(){
         return "Tejashri";
     }

    public int getLength(){
         return getName().length(); // o/p 8
    }

    public boolean isMaxLength() {
         if (getLength() > 8){
             return true;
        } else {
             return false;
         }
    }
    public static void main(String[] args) {
        TestMethodWithReturnValuesFromDiffMethod1 obj = new TestMethodWithReturnValuesFromDiffMethod1();
        System.out.println(obj.isMaxLength());

Employee emp = new Employee();
String name = emp.getEmployeeName();
System.out.println(name.toUpperCase());
        TestMethodWithThisReturnType obj1 = new TestMethodWithThisReturnType();
        String nm = obj1.getDetails().getData().getEmployeeName();
        System.out.println(nm);
    }
}
