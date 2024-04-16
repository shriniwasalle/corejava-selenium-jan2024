package org.alpha.aishwarya.seleniumconcepts.pom3.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static String getPropertyValue(String key) throws IOException {  // maked Static so we can NOT create Object

        String pathOfProject=  System.getProperty("user.dir"); // standard java key:Use:To Find drive path
        System.out.println("Project Path :: " +pathOfProject);
        File file = new File(pathOfProject + "\\src\\main\\java\\org\\alpha\\aishwarya\\seleniumconcepts\\pom3\\resources\\config.properties"); // File dynamic access using above key: user.bir
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);

        String value = prop.getProperty(key); // url value
        return value;

        /**
         * OR we can write:
         * return prop.getProperty(key);
         */
    }

}




