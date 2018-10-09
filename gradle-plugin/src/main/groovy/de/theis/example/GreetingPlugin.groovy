package de.theis.example

import org.gradle.api.Plugin
import org.gradle.api.Project

public class GreetingPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.task("hello")
                .doLast( System.out.println("Hello Gradle!"));
    }


}