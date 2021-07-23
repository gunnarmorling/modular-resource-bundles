package dev.morling.greeter.base.internal;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.spi.AbstractResourceBundleProvider;

import dev.morling.greeter.spi.GreetingMessagesProvider;

public class EnglishGreetingMessagesProvider extends AbstractResourceBundleProvider implements GreetingMessagesProvider {

    @Override
    public ResourceBundle getBundle(String baseName, Locale locale) {
        System.out.println("Using message provider");
        if (locale.equals(Locale.ENGLISH)) {
            return super.getBundle(baseName.replace("GreetingMessages", "en.GreetingMessages"), locale);
        }

        return null;
    }
}
