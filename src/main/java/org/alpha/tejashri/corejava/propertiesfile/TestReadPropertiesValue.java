package org.alpha.tejashri.corejava.propertiesfile;

import java.io.IOException;

public class TestReadPropertiesValue {

    public static void main(String[] args) throws IOException {
        TestProperties obj = new TestProperties();
        String userName = obj.getPropertyValues("user.name"); //value returned from getPropertyValues method & stored in variable to perform further operation
        System.out.println("Finding length of user name : " + userName.length()); //performed length operation on userName variable which is string

        String password = obj.getPropertyValues("user.password");
        System.out.println("Finding length of user password : " + password.length());

        String str = "Admin";

        if (str.equals("Admin")) {
            obj.getPropertyValues("role.admin");
        } else if (str.equals("operator")) {
            obj.getPropertyValues("role.operator");
        }
        System.out.println(obj);
    }
}
