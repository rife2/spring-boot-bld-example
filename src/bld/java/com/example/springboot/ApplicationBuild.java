package com.example.springboot;

import rife.bld.BuildCommand;
import rife.bld.WebProject;
import rife.bld.extension.BootJarOperation;
import rife.bld.extension.BootWarOperation;

import java.util.List;

import static rife.bld.dependencies.Repository.MAVEN_CENTRAL;
import static rife.bld.dependencies.Scope.*;

public class ApplicationBuild extends WebProject {
    public ApplicationBuild() {
        pkg = "com.example.demo";
        name = "DemoApplication";
        mainClass = "com.example.springboot.Application";
        version = version(0, 1, 0);

        javaRelease = 17;

        autoDownloadPurge = true;

        repositories = List.of(MAVEN_CENTRAL);

        scope(compile)
                .include(dependency("org.springframework.boot:spring-boot-starter:3.2.2"))
                .include(dependency("org.springframework.boot:spring-boot-starter-actuator:3.2.2"))
                .include(dependency("org.springframework.boot:spring-boot-starter-web:3.2.2"));
        scope(test)
                .include(dependency("org.springframework.boot:spring-boot-starter-test:3.2.2"))
                .include(dependency("org.junit.jupiter:junit-jupiter:5.10.1"))
                .include(dependency("org.junit.platform:junit-platform-console-standalone:1.10.1"));
        scope(standalone)
                .include(dependency("org.springframework.boot:spring-boot-loader:3.2.2"));
    }

    public static void main(String[] args) {
        new ApplicationBuild().start(args);
    }

    @BuildCommand(summary = "Creates an executable JAR for the project")
    public void bootjar() throws Exception {
        new BootJarOperation()
                .fromProject(this)
                .execute();
    }

    @BuildCommand(summary = "Create an executable WAR for the project")
    public void bootwar() throws Exception {
        new BootWarOperation()
                .fromProject(this)
                .execute();
    }
}