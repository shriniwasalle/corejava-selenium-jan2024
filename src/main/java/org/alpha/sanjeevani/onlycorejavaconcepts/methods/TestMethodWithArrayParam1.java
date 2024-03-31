package org.alpha.sanjeevani.onlycorejavaconcepts.methods;

public class TestMethodWithArrayParam1 {
    public void getAgeDta(int [] age){
        for (int i=0;i<=age.length-1;i++){
            System.out.println(age[i]);
        }
    }
    public void getStrDta(String [] str){
        for (int i=0;i<=str.length-1;i++){
            System.out.println(str[i]);
        }

    }
    public void getNameData(char [] name){
        for (int i=0;i<=name.length-1;i++){
            System.out.println(name[i]);
        }
    }
    public void getNameData2(char [] name){
        for(char cr :name){
            System.out.println(cr);
        }
    }
    public static void main(String[] args) {
        int [] age={3,5,7,9,11,13};
        String [] str={"Raje1","Raje2","Raje3","Raje4","Raje5"};
        char [] name={'A','E','I','O','U'};
        TestMethodWithArrayParam1 obj=new TestMethodWithArrayParam1();
        obj.getAgeDta(age);
        System.out.println("                    ");
        obj.getStrDta(str);
        System.out.println("                    ");
        obj.getNameData(name);
        System.out.println("                    ");
        obj.getNameData2(name);
    }
}
