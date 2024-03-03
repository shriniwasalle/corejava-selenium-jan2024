package org.alpha.sanjeevani.oopsconcepts.inheritance;

//Hierarchical inheritance child1 extends parent
public class TestHieChild1 extends TestHieParent1{
    public void getData(){
        System.out.println(age);

    }
    public static void main(String[] args) {
    TestHieChild1 obj=new TestHieChild1();
    obj.getData();
    obj.getDetails();
}
}

