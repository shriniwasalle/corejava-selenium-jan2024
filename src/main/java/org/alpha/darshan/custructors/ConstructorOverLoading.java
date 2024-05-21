package org.alpha.darshan.custructors;

public class ConstructorOverLoading {

    int id;

    String empName;

    int empPayment;
    public  ConstructorOverLoading(int id, String empName){
        this.id=id;
        this.empName=empName;
        System.out.println("id:"+id+"\n"+"empName:"+empName);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
    public ConstructorOverLoading(int id,String empName,int empPayment){
        this.empPayment=empPayment;
        System.out.println("id:"+id+"\n"+"empName:"+empName+"\n"+"empPayment:"+empPayment);

    }
    
    private ConstructorOverLoading(int age){
        System.out.println("age:"+age);
    }//we can create private constructor but it will access within the same class

    protected ConstructorOverLoading(){
        System.out.println("i am in protected constructor");
    }

    public static void main(String[] args) {
        ConstructorOverLoading l1= new ConstructorOverLoading(101,"darshan");
        new ConstructorOverLoading(101,"gaikwad",30000);
        new ConstructorOverLoading(60);
        new ConstructorOverLoading();
    }
}
