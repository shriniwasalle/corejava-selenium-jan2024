package org.alpha.darshan.opponcept.abstraction;

public class Honda extends TestAbstractClass{
    @Override
    public void run() {
        System.out.println("Running:HONDA");
    }

    public static void main(String[] args) {

        TestAbstractClass t1= new Honda();
        t1.run();
        t1.speed();
    }
}
