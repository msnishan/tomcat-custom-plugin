package com.nishan.custom.tomcat

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class CustomTomcat implements Plugin<Project>{

    @Override
    public void apply(Project project) {
        Tomcat tomcat = new Tomcat()
        project.task('startTomcat') << {
            println "starting tomcat"
            tomcat.startTomcat()
            println "done"
        }
        project.task('stopTomcat') << {
            println "stopping tomcat"
            tomcat.stopTomcat()
            println "done"
        }
    }

}
