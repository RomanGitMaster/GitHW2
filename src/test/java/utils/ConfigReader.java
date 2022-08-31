package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    public static Properties readProperties(String filePath) {
      try {
          FileInputStream fis = new FileInputStream(filePath);
          properties = new Properties();
          properties.load(fis);
      }catch(FileNotFoundException e){
          e.printStackTrace();
      }catch (Exception e){
          e.printStackTrace();
      }
        return properties;
    }
    public static String getPropertyValyue(String key){
        return properties.getProperty(key);
    }
}
