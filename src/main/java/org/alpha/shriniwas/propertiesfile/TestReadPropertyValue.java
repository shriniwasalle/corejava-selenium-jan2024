package org.alpha.shriniwas.propertiesfile;

import java.io.IOException;

public class TestReadPropertyValue {

    public static void main(String[] args) throws IOException {
        TestProperties obj = new TestProperties();

        String userName = obj.getPropertyValue("user.name");
        System.out.println("For Some Actions on Value: " +userName.length());

        String password = obj.getPropertyValue("user.password");
        System.out.println("For Some Actions on Value: " +password.length());

        String str = "Admin";

        if (str.equals("Admin")) {
            obj.getPropertyValue("role.admin");
        } else if(str.equals("operator")) {
            obj.getPropertyValue("role.operator");
        }
    }
}
