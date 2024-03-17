package org.alpha.shriniwas.propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public String getPropertyValue(String key) throws IOException {
        File file = new File("D:\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\shriniwas\\propertiesfile\\config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);

        String value = prop.getProperty(key); // url value
        return value;
    }


    public static void main(String[] args) throws IOException {
//        System.out.println("https://www.google.com/");
//        String userName = "ShriniwasAlle";
//        String password = "Shri123";
//
//        System.out.println("Enter user name" +userName);
//        System.out.println("Enter password" +password);

        TestProperties prop = new TestProperties();
        prop.getPropertyValue("url");
    }
}
