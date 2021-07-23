package dev.morling.greeter.app;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        String greeting = greeter.greet("Bob", Locale.ENGLISH);
        assert "hello, Bob".equals(greeting) : "ENGLISH bundle should be provided";

        greeting = greeter.greet("Bob", Locale.GERMAN);
        assert "moin, Bob".equals(greeting) : "GERMAN bundle should be provided";

        greeting = greeter.greet("Bob", Locale.FRENCH);
        assert "salut, Bob".equals(greeting) : "FRENCH bundle should be provided";
    }
}
