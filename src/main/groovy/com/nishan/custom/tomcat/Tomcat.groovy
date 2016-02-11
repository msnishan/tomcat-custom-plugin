package com.nishan.custom.tomcat

class Tomcat {

    Tomcat() {
        init()
    }
    enum OS {
        LINUX, WINDOWS
    }
    
    enum Status {
        RUNNING, STOPPED
    }
    String tomcatLocation = System.getenv("CATALINA_BASE")
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
    
    boolean startTomcat() {
        if(getStatus() == Status.RUNNING) {
            return true;
        } else {
            if (oSType == OS.WINDOWS) {
                String startupCommand = tomcatLocation + "\\bin\\" + command + fileExt + " " + start
                println(startupCommand)
                def output = executeCommand(startupCommand)
                println(output)
                status = Status.RUNNING
                return true
            } else {
                
            }
        }
    }
    
    Status getStatus() {
        return status
    }
    
    boolean stopTomcat() {
        if(true) {       //later getStatus() == Status.RUNNING
            if (oSType == OS.WINDOWS) {
                String stopCommand = tomcatLocation + "\\bin\\" + command + fileExt + " " + stop
                println(stopCommand)
                def output = executeCommand(stopCommand)
                println(output)
                return true
            } else {
                
            }
        } else {
            return true;
        }
    }
    
    def executeCommand(command) {
        def proc = command.execute()
        //def outputStream = new StringBuffer()
        //proc.waitForProcessOutput(outputStream, System.err)
        return "yes"
    }
}
