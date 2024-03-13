package org.alpha.tejashri.propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public String getPropertyValues(String key) throws IOException {
        File file = new File("D:\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\tejashri\\propertiesfile\\config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInputStream);
        String value = prop.getProperty(key); // url value
        return value;
    }

    public static void main(String[] args) throws IOException {
        TestProperties prop = new TestProperties();
        prop.getPropertyValues("url");
    }
}
