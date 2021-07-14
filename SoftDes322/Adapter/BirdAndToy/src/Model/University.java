package Model;

import Service.Bachelor;
import Service.Student;

public class University implements Student {

    private Bachelor bachelor;

    public University(Bachelor bachelor){
        this.bachelor = bachelor; 
    } 

    @Override
    public void educate() {
        System.out.println("We make the Great Bachelor");
        this.bachelor.readyToWork();
    }
}
