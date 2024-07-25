package org.alpha.sanjeevani.seleniumconcepts.pom2.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.security.Key;
import java.util.Properties;

public class ReadPropertiesFiles {
    public static String getPropertyValue(String key) throws IOException {

          String pathOfProject=System.getProperty("user.dir");
        //System.out.println(System.getProperty("user.dir"));
          System.out.println("Path of Project:"+pathOfProject);

        File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\org\\alpha\\sanjeevani\\seleniumconcepts\\pom2\\resources\\config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);

        return prop.getProperty(key);

    }

}
//C:\Users\Dell\corejava-selenium-jan2024\src\main\java\org\alpha\sanjeevani\seleniumconcepts\pom2\resources\config.properties