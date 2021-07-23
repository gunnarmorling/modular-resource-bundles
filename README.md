# Resource Bundle Test

Demo for loading `java.util.ResourceBundle` with different Java versions/configurations:

* Java 1.8
* Java 9+ (classpath)
* Java 9+ (module path)

Different locale variants of the `dev.morling.greeter.GreetingMessages` resource bundle are contributed by the _base_, _german_, and _french_ modules.
They are loaded by the _app_ module.
Loading happens via an explicitly passed `Control` (on Java 1.8),
via a `ResourceBundleControlProvider` (on Java 9+ with classpath),
or via `ResourceBundleProvider`s (on Java 9+ with module path),
respectively.

## Build

Run

```
mvn clean install
```

to build all modules.

Then run the following to execute the different scenarios:

* Java 1.8:

```
export JAVA_HOME=/path/to/java-1.8
mvn exec:exec -pl :resourceloading-test-runner -Pclasspath
```

* Java 9+ (classpath):

```
export JAVA_HOME=/path/to/java-9+
mvn exec:exec -pl :resourceloading-test-runner -Pclasspath
```

* Java 9+ (module path):

```
export JAVA_HOME=/path/to/java-9+
mvn exec:exec -pl :resourceloading-test-runner
```
