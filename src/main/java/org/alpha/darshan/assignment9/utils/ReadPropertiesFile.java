package org.alpha.darshan.assignment9.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static String getPropertiesValue(String key) throws IOException {
        String File_Path= System.getProperty("user.dir");
        File file= new File(File_Path+"\\src\\main\\java\\org\\alpha\\darshan\\assignment9\\resources\\config.properties");
        FileInputStream fileInputStream= new FileInputStream(file);
        Properties pr= new Properties();
        pr.load(fileInputStream);
        return pr.getProperty(key);
    }
}
