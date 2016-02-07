package com.custom.tomcat

class Tomcat {

    enum OS {
        LINUX, WINDOWS
    }
    
    enum Status {
        RUNNING, STOPPED
    }
    String tomcatLocation = System.getenv("CATALINA_HOME")
    OS oSType = OS.WINDOWS
    Status status = Status.STOPPED
    String command = "catalina"
    String start = "start"
    String stop = "stop"
    String fileExt = ".bat"

    void init() {
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            oSType = OS.WINDOWS
            fileExt = ".bat"
        } else {
            oSType = OS.LINUX
            fileExt = ".sh"
        }

        
    }
    

}
