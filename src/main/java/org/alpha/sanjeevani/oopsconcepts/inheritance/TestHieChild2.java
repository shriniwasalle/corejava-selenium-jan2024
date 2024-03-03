package org.alpha.sanjeevani.oopsconcepts.inheritance;

//Hierarchical inheritance child2 also extends parent
public class TestHieChild2 extends TestHieParent1 {
    public void getData(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        TestHieChild2 obj=new TestHieChild2();
        obj.getData();
        obj.getDetails();

    }
}
