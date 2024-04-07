package org.alpha.aishwarya.methods;

public class TestMethodsWithTypesOfParametrers {

    // Method using Parameter for reuse purpose use.
// Multiple ouputs comes using Methods with Parameter concepts
// We can Use 1 method multiple times.
    public void m1(int a, float b) {
        System.out.println("Using With Parameter userdefined output comes");
    }


    public void m1(float a, float b) {
        System.out.println("Print float type data: User definded");
    }

    /**
     * public void m1(float a, int b){
     * float c = 1100f ;
     * float d = 10.0f;
     * float ee = a+b;
     * System.out.println(ee);
     * }
     */


    public static void main(String[] args) {

        TestMethodsWithTypesOfParametrers obj = new TestMethodsWithTypesOfParametrers();
        obj.m1(10, 10.5f);
        obj.m1(10.5f, 10.5f);


    }

}
/**
 * ----Outputs----
 * Using With Parameter userdefined output comes
 * Print float type data: User definded
 */