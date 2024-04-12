package org.alpha.shriniwas.seleniumconcepts.pom3.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static String getPropertyValue(String key) throws IOException {

        File file = new File(System.getProperty("user.dir") +"\\src\\main\\java\\org\\alpha\\shriniwas\\seleniumconcepts\\pom3\\resources\\config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);

        return prop.getProperty(key);
    }
}
