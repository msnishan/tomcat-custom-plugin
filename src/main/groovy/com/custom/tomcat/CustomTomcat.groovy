package com.custom.tomcat

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class CustomTomcat implements Plugin<Project>{

    @Override
    public void apply(Project project) {
        project.task('hello') << {
            println "hello from plugin"
        }
    }

}
