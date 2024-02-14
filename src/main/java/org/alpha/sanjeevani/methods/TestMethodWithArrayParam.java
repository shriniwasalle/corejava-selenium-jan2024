package org.alpha.sanjeevani.methods;

public class TestMethodWithArrayParam {
    public void getNames(int [] name){
        System.out.println(name);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);

    }
    public void getNames(String [] str){
        System.out.println(str);
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);
        System.out.println(str[4]);
        System.out.println(str[5]);

    }
    public static void main(String[] args) {
        int [] ids={10,20,30,40,50};
        String [] str={"sanju","nitu","vinu","manu","vedu","sloku"};
        TestMethodWithArrayParam obj=new TestMethodWithArrayParam();
        obj.getNames(ids);
        System.out.println("                ");
        obj.getNames(str);
    }
}
