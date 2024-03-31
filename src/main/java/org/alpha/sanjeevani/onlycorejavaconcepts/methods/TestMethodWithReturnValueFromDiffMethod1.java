package org.alpha.sanjeevani.onlycorejavaconcepts.methods;

public class TestMethodWithReturnValueFromDiffMethod1 {
    public String getName(){
        return "sanjeevani"+"sutar";

    }
    public int getNameLength(){
        System.out.println(getName());
        return getName().length();
    }
    public boolean getMaxLength(){
        if(getNameLength()>=15){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        TestMethodWithReturnValueFromDiffMethod1 obj=new TestMethodWithReturnValueFromDiffMethod1();
        System.out.println(obj.getMaxLength());
        Employee1 emp=new Employee1();
        //System.out.println(emp.getEmpName().toUpperCase());
        String str=emp.getEmpName();
        System.out.println(str.toUpperCase());

        TestMethodWithThisReturnType obj1=new TestMethodWithThisReturnType();
        String name=obj1.getDetails().getData().getEmpName();
        System.out.println(name);
    }

}
