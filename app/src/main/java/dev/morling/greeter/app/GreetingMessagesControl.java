package dev.morling.greeter.app;

import java.util.Locale;
import java.util.ResourceBundle.Control;

public class GreetingMessagesControl extends Control {

    @Override
    public String toBundleName(String baseName, Locale locale) {
        System.out.println("base: "+ baseName);
        System.out.println("locale: " + locale.getLanguage());

        return super.toBundleName(baseName.replace("GreetingMessages", locale.getLanguage() + ".GreetingMessages"), locale);
    }
}