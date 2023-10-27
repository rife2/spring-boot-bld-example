# Spring Boot Example for [b<span style="color:orange">l</span>d](https://rife2.com/bld)

Based on the Spring Guides' Spring Boot web application example. Please be sure to read the
[guide](https://spring.io/guides/gs/spring-boot/) for a sampling of how Spring Boot can help
you accelerate application development 

## Running the Application

To run the web application, issue the following command:

```
./bld compile run
```

To access the web application, issue the follow command:

```
curl localhost:8080
```

To access the web application services:

```
curl localhost:8080/actuator/health
curl localhost:8080/actuator/info
curl localhost:8080/actuator/shutdown
```

## Testing the Application

To run the web application tests, issue the following command:

```
./bld test
```

## Creating and launching the executable JAR

```
./bld bootjar
java -jar build/dist/demoapplication-0.1.0-boot.jar
```
