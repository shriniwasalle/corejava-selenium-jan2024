package org.alpha.shriniwas.methods;

public class TestMethodsWithReturnValueFromDiffMethod1 {

    public String getName() {
        return "Shriniwas";
    }

    public int getLength() {
        return getName().length();
    }

    public boolean isMaxLength() {
        if(getLength() >= 9) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TestMethodsWithReturnValueFromDiffMethod1 obj = new TestMethodsWithReturnValueFromDiffMethod1();
        System.out.println(obj.isMaxLength());
    }
}
