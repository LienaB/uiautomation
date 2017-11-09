package com.nordstrom.smrt.base;

import com.google.common.base.Strings;

import java.util.Properties;


public class Config {
    public String baseHost;
    public String smrtUser;
    public String smrtPassword;

    public String dbUrl;
    public String dbScheme;
    public String dbClass;
    public String dbUser;
    public String dbPassword;

    public void setConfiguration(Properties properties){
        baseHost = getPropertyValue (properties,"baseHost", baseHost);
        smrtUser = getPropertyValue (properties,"smrt.user", smrtUser);
        smrtPassword = getPropertyValue (properties,"smrt.password", smrtPassword);

        dbUrl = getPropertyValue (properties,"db.url", dbUrl);
        dbScheme = getPropertyValue (properties,"db.scheme", dbScheme);
        dbClass = getPropertyValue (properties,"db.driver-class-name", dbClass);
        dbUser = getPropertyValue (properties,"db.username", dbUser);
        dbPassword =getPropertyValue (properties,"db.password", dbPassword);

    }

    private String getPropertyValue (Properties properties,  String key, String defaultValue){
        return (Strings.isNullOrEmpty(properties.getProperty(key)) )?  defaultValue : properties.getProperty(key);
    }
}
