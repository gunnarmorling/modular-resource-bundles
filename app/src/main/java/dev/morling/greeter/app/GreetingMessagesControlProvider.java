package dev.morling.greeter.app;

import java.util.ResourceBundle.Control;
import java.util.spi.ResourceBundleControlProvider;

public class GreetingMessagesControlProvider implements ResourceBundleControlProvider {

    @Override
    public Control getControl(String baseName) {
        System.out.println("Using control provider");
        return new GreetingMessagesControl();
    }

}
