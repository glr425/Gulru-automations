package com.myProjects.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();// the object of the properties class     it is static because it is being used in a static method

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);//load the properties object using FileInputStream object

            file.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
