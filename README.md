# [Spring Boot](https://spring.io/projects/spring-boot) Web Application Example for [b<span style="color:orange">l</span>d](https://rife2.com/bld)

Based on the Spring Guides' Spring Boot web application example. Please be sure to read the
[guide](https://spring.io/guides/gs/spring-boot/) for a sampling of how Spring Boot can help
you accelerate application development 

## Compile the Application

To compile the web application, issue the following command:

```
./bld compile
```

## Running the Application

To run the compiled web application, issue the following command:

```
./bld run
```

To access the web application, issue the follow command:

```
curl localhost:8080
```

To access the web application services:

```
curl localhost:8080/actuator/health
curl localhost:8080/actuator/info
curl -X POST localhost:8080/actuator/shutdown
```

## Testing the Application

To run the compiled web application tests, issue the following command:

```
./bld test
```

## Creating and launching the executable Java Archive (JAR)

To build and launch the executable JAR, issue the following commands:

```
./bld compile bootjar
java -jar build/dist/demoapplication-0.1.0-boot.jar
```

## Creating and launching the executable Web Archive (WAR)

To build and launch the executable WAR, issue the following commands:

```
./bld compile bootwar
java -jar build/dist/demoapplication-0.1.0-boot.war
```
