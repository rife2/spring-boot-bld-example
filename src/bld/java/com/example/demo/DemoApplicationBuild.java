package com.example.demo;

import rife.bld.BaseProject;

import java.util.List;

import static rife.bld.dependencies.Repository.*;
import static rife.bld.dependencies.Scope.compile;
import static rife.bld.dependencies.Scope.test;

public class DemoApplicationBuild extends BaseProject {
    public DemoApplicationBuild() {
        pkg = "com.example.demo";
        name = "DemoApplication";
        mainClass = "com.example.demo.DemoApplication";
        version = version(0,1,0);

        repositories = List.of(MAVEN_CENTRAL);

        scope(compile)
                .include(dependency("org.springframework.boot", "spring-boot-starter",
                        version(3,1,5)));
        scope(test)
                .include(dependency("org.springframework.boot", "spring-boot-starter-test",
                        version(3,1,5)))
                .include(dependency("org.junit.jupiter", "junit-jupiter",
                        version(5,10,0)));

        testOperation().mainClass("com.example.demo.DemoApplicationTest");
    }
    public static void main(String[] args) {
        new DemoApplicationBuild().start(args);
    }
}