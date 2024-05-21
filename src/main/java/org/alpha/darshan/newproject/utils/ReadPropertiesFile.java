package org.alpha.darshan.newproject.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static String getPropertyValue(String key) throws IOException {
        String pathOfProject = System.getProperty("user.dir");
        File file = new File(pathOfProject + "\\src\\main\\java\\org\\alpha\\darshan\\newproject\\resources\\config.properties");
        FileInputStream fileInputStream= new FileInputStream(file);
        Properties pr= new Properties();
        pr.load(fileInputStream);
        return pr.getProperty(key);

    }
}
