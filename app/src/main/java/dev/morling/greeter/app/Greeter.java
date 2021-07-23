package dev.morling.greeter.app;

import java.util.Locale;
import java.util.ResourceBundle;

import dev.morling.greeter.spi.Constants;

public class Greeter {

    public String greet(String name, Locale locale) {
        System.out.println("Using explicit control");
        ResourceBundle bundle = ResourceBundle.getBundle(Constants.BASE_NAME, locale, new GreetingMessagesControl());
        return bundle.getString("greeting") + ", " + name;
    }
}
