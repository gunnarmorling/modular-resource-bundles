package dev.morling.greeter.app;

import java.util.Locale;
import java.util.ResourceBundle;

import dev.morling.greeter.spi.Constants;

public class Greeter {

    public String greet(String name, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle(Constants.BASE_NAME, locale);
        return bundle.getString("greeting") + ", " + name;
    }
}
