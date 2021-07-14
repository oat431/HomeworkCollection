package Model;

import Service.Bachelor;
import Service.Student;

public class SEmajor implements Bachelor,Student {
    @Override
    public void readyToWork() {
        System.out.println("I am a Software Architecture and Ready to work");
    }

    @Override 
    public void educate(){
        System.out.println("I am a software engineering student that study for future");
    }
    
}
