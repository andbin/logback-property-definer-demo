<a name="">![Java 11](https://img.shields.io/badge/Java-11-cd853f "Java 11")</a>
<a name="">![Built with Apache Maven](https://img.shields.io/badge/Built%20with-Apache%20Maven-f76504 "Built with Apache Maven")</a>
<a name="">![MIT License](https://img.shields.io/badge/License-MIT-1081c1 "MIT License")</a>

# Logback property definer demo

This is a simple demo project that shows the implementation of *property definers* with the **[logback](https://logback.qos.ch)** logging library. The main purpose of this project is the definition of a custom dynamic property named `vmId` that contains the identifier of the running JVM instance. This property is then configured in the `logback.xml` configuration file and logged on all log records.

This tecnique has been described in my blog article **[Implementation of property definers with logback](https://andbin.dev/java/logback-property-definers)**.

See the project files:

* [VmIdPropertyDefiner.java](src/main/java/dev/andbin/logbackdemo/VmIdPropertyDefiner.java), the class that implements the `PropertyDefiner` interface provided by logback
* [logback.xml](src/main/resources/logback.xml), the logback configuration file
* [Main.java](src/main/java/dev/andbin/logbackdemo/Main.java), the “main” class that can be used to verify the logging output

## License

This project is released under the **MIT License**, a very *permissive* free software license.

See the full text of the license: **[LICENSE.txt](LICENSE.txt)**
