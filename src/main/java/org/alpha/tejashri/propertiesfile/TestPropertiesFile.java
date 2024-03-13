package org.alpha.tejashri.propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesFile {
    public static void main(String[] args) throws IOException {
//        // Hard coding
//        System.out.println("https://www.google.com/");
//
//        String username = "Tejashri";
//        String userpassword = "teja123";
//
//        System.out.println("Enter user name : " + username);
//        System.out.println("Enter user password : " + userpassword);
//
        File file = new File("D:\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\tejashri\\propertiesfile\\config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);
        String url = prop.getProperty("url"); // url value
        System.out.println(url);

        String userName = prop.getProperty("user.name"); // user name
        System.out.println(userName);

        String userPassword = prop.getProperty("user.password"); // password
        System.out.println(userPassword);
    }
}
