package com.restaurent.management.properties;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvironmentPropertiesLoader {
    private static final Dotenv dotEnv = Dotenv.load();
    private static final String RESTAURANT_KEYSTORE_PATH = "RESTAURANT_KEYSTORE_PATH";
    private static final String RESTAURANT_KEYSTORE_PASSWD = "RESTAURANT_KEYSTORE_PASSWD";

    public static void loadSystemProperties(){
        System.setProperty(RESTAURANT_KEYSTORE_PATH, dotEnv.get(RESTAURANT_KEYSTORE_PATH));
        System.setProperty(RESTAURANT_KEYSTORE_PASSWD, dotEnv.get(RESTAURANT_KEYSTORE_PASSWD));
    }
}
