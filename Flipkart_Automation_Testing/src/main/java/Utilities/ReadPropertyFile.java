package Utilities;

import org.apache.commons.lang3.StringUtils;
import java.io.FileInputStream;
import java.util.Properties;

// Utility class for reading properties from a configuration file
public class ReadPropertyFile {

    // Method to get a property value based on the provided key
    public static String getPropertyFile(String key) throws Exception {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/ConfigFiles/config.properties";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        // Retrieving the value associated with the provided key
        String value = properties.get(key).toString();

        // Checking if the retrieved value is empty or null and Throwing an exception if the value is not specified for the given key
        if(StringUtils.isEmpty(value)){
            throw new Exception("Value is not specified for key: " + key + " in propertiesFile");
        }
        return value;
    }
}
