# hogwarts-micro-services

## Requirements

For building and running the application you need:

- [JDK 17.0.9](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.thinhtranuit.hogwarts.subject.SubjectApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
cd subject
mvn spring-boot:run
```