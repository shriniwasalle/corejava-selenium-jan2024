package org.alpha.sanjeevani.onlycorejavaconcepts.propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {

        /*System.out.println("https://www.google.co.in/");
        String userName="sanjeevani";
        String password="sanju7028";
        System.out.println("enter your userName :"+userName);
        System.out.println("enter your password :"+password);
*/

        File file = new File("C:\\Users\\Dell\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\sanjeevani\\propertiesfile\\config.properties");

        FileInputStream fileinputstream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileinputstream);

        String url = prop.getProperty("url"); // url value
        System.out.println(url);

        String userneme = prop.getProperty("user.name"); // url value
        System.out.println(userneme);

        String password = prop.getProperty("user.password"); // url value
        System.out.println(password);


    }
}
