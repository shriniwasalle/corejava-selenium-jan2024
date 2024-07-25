package org.alpha.sanjeevani.assignment.assignment9.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static String getPropertyValues(String key) throws IOException, IOException {
        //without storing in another variable
        File file = new File(System.getProperty("user.dir") + "\\src\\main\\java\\org\\alpha\\sanjeevani\\assignment\\assignment9\\resources\\config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fileInputStream);

        //Without Storing in another variable directly returned
        return prop.getProperty(key);
    }
}