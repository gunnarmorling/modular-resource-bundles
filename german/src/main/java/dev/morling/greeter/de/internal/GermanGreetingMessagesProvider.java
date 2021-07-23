package dev.morling.greeter.de.internal;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.spi.AbstractResourceBundleProvider;

import dev.morling.greeter.spi.GreetingMessagesProvider;

public class GermanGreetingMessagesProvider extends AbstractResourceBundleProvider implements GreetingMessagesProvider {

    @Override
    public ResourceBundle getBundle(String baseName, Locale locale) {
        if (locale.equals(Locale.GERMAN)) {
            return super.getBundle(baseName.replace("GreetingMessages", "de.GreetingMessages"), locale);
        }

        return null;
    }
}
