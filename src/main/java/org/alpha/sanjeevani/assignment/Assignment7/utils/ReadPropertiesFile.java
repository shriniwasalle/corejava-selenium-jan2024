package org.alpha.sanjeevani.assignment.Assignment7.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static String getPropertyValues(String key) throws IOException, IOException {
        //without storing in another variable
        File file = new File(System.getProperty("user.dir") + "\\src\\main\\java\\org\\alpha\\sanjeevani\\assignment\\Assignment7\\resources\\config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);

        //Without Storing in another variable directly returned
        return prop.getProperty(key);
    }
}
//C:\Users\Dell\corejava-selenium-jan2024\src\main\java\org\alpha\sanjeevani\assignment\Assignment7\resources\config.properties