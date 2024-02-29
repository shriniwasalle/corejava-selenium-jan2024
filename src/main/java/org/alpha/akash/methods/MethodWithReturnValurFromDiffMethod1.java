package org.alpha.akash.methods;

public class MethodWithReturnValurFromDiffMethod1 {
    public String getName() { return  "Akash";}

    public int getLength() { return getName().length();}//5

    public boolean isMaxLength() {
        if(getLength() >= 5) {
            return  true;
        }else  {
            return false;

        }
    }

    public static void main(String[] args) {
        MethodWithReturnValurFromDiffMethod1 obj = new MethodWithReturnValurFromDiffMethod1();
        System.out.println(obj.isMaxLength());//True

        Employee emp = new Employee();
        String name = emp.getEmpName();
        System.out.println(name);  //Employee:-Akki
        System.out.println(name.toUpperCase()); //AKKI

        MethodWithThisReturnType obj1 =new MethodWithThisReturnType();
        String name1 = obj1.getDetails().getData().getEmpName();
        System.out.println(name1);//MethodWithThisReturnType:-Employee:-Akki


    }
}
