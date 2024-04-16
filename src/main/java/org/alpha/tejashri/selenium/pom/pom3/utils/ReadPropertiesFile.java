package org.alpha.tejashri.selenium.pom.pom3.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static String getPropertyValues(String key) throws IOException {
        //with storing in another variable
        String pathOfProject = System.getProperty("user.dir");// user.dir : this key is specified in java
        System.out.println("Project path : " +pathOfProject);

        File file = new File(pathOfProject +"\\src\\main\\java\\org\\alpha\\tejashri\\selenium\\pom\\pom3\\resources\\config.properties");

        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);

        //with storing in another variable
        String value = prop.getProperty(key); // url value
        return value;

    }
}