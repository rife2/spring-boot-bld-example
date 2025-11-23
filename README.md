# [Spring Boot](https://spring.io/projects/spring-boot) Web Application Example for [b<span style="color:orange">l</span>d](https://rife2.com/bld)

Based on the Spring Guides' Spring Boot web application example. Please be sure
to read the [guide](https://spring.io/guides/gs/spring-boot/) for a sampling of
how Spring Boot can help you accelerate application development.

This template is using the [Spring Boot Helper Extension](https://github.com/rife2/bld-spring-boot) for bld.

This template is based on Spring Boot v4.0.x. An
[example based on v3.5.x](https://github.com/rife2/bld-spring-boot/tree/main/examples/3.5.x) is also available

## Compile the Application

To compile the web application, issue the following command:

```console
./bld compile
```

## Running the Application

To run the compiled web application, issue the following command:

```console
./bld run
```

To access the web application, issue the follow command:

```console
curl localhost:8080
```

To access the web application services:

```console
curl localhost:8080/actuator/health
curl localhost:8080/actuator/info
curl -X POST localhost:8080/actuator/shutdown
```

## Testing the Application

To run the compiled web application tests, issue the following command:

```console
./bld test
```

## Creating and launching the executable Java Archive (JAR)

To build and launch the executable JAR, issue the following commands:

```console
./bld compile bootjar
java -jar build/dist/demoapplication-0.1.0-boot.jar
```

## Creating and launching the executable Web Archive (WAR)

To build and launch the executable WAR, issue the following commands:

```console
./bld compile bootwar
java -jar build/dist/demoapplication-0.1.0-boot.war
```

# Explore

- [View Build File](https://github.com/rife2/spring-boot-bld-example/blob/main/src/bld/java/com/example/springboot/ApplicationBuild.java)
- [View Wrapper Properties](https://github.com/rife2/spring-boot-bld-example/blob/main/lib/bld/bld-wrapper.properties)
