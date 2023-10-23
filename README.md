# RIFE2 Spring Boot Example

Based on the Spring Guides' [Sping Boot](https://github.com/spring-guides/gs-spring-boot) web application example.

## Run the Application

To run the web application, issue the following command:

```
./bld run
```

To access the web application, issue the follow command:

```
curl localhost:8080
```

To access the web application services:

```
curl localhost:8880/
curl localhost:8080/actuator/health
curl localhost:8080/actuator/info
curl localhost:8080/actuator/shutdown
```

## Test the Application

To run the web application tests, issue the following command:

```
./bld test
```