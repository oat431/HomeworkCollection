package Model;

import Service.User;

public class Teacher implements User {
    @Override
    public void loadService() {
       System.out.println("You logged in as Teacher"); 
    } 
}
