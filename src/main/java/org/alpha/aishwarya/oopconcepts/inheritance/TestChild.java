package org.alpha.aishwarya.oopconcepts.inheritance;

public class TestChild extends TestParent{

    public void getData(){
        System.out.println(age);
    }

 public static void main(String[] args){
     TestChild obj = new TestChild();
      obj.getData();
    }
}
