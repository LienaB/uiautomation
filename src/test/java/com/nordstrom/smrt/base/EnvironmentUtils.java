package com.nordstrom.smrt.base;

import com.google.common.base.Strings;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Properties;

import static org.springframework.core.io.support.PropertiesLoaderUtils.*;

public class EnvironmentUtils {

    private static Config config;

    public static Config getPropertiesFromConfig(){
        if (config !=null) return config;

        config = new Config();
        //loading common properties
        String path = "/properties/common.config.properties";
        config.setConfiguration(loadConfiguration(path));

        //loading environment related properties
        String env = System.getProperty("env");

        if (env!=null){
            path = String.format("/properties/%s.config.properties", env);
            config.setConfiguration(loadConfiguration(path));
        }

        //loading environment variables: host, dbUrl, dbScheme
        config.baseHost = (System.getProperty("host")!=null) ?
                String.format("http://%s:8080/", System.getProperty("host"))
                : config.baseHost;
        config.dbUrl = (System.getProperty("dbUrl")!=null)? System.getProperty("dbUrl") : config.dbUrl;
        config.dbScheme = (System.getProperty("dbScheme")!=null)? System.getProperty("dbScheme") : config.dbScheme;
        return config;
    }

    public static Properties loadConfiguration(String path){
        try{
            Resource resource = new ClassPathResource(path);
            return loadProperties(resource);
        }
        catch (Exception e) {
            throw new RuntimeException("No way to read the configuration file :" + path);
        }
    }

    private static String getEnvironmentVariable(String key, String defaultValue ){
        String value = System.getProperty(key);
        return Strings.isNullOrEmpty(value)? defaultValue: value;
    }
}
