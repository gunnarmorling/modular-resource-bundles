package dev.morling.greeter.fr.internal;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.spi.AbstractResourceBundleProvider;

import dev.morling.greeter.spi.GreetingMessagesProvider;

public class FrenchGreetingMessagesProvider extends AbstractResourceBundleProvider implements GreetingMessagesProvider {

    @Override
    public ResourceBundle getBundle(String baseName, Locale locale) {
        if (locale.equals(Locale.FRENCH)) {
            return super.getBundle(baseName.replace("GreetingMessages", "fr.GreetingMessages"), locale);
        }

        return null;
    }
}
