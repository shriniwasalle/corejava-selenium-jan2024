package org.alpha.darshan.assignment10.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static String getPropertyValue(String key) throws IOException {
        String File_PATH=  System.getProperty("user.dir");
        File file= new File(File_PATH+"\\src\\main\\java\\org\\alpha\\darshan\\assignment10\\resources\\config.properties");
        FileInputStream fileInputStream= new FileInputStream(file);
        Properties pr= new Properties();
        pr.load(fileInputStream);
        return pr.getProperty(key);
    }
}
