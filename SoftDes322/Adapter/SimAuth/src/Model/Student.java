package Model;

import Service.User;

public class Student implements User {
    @Override
    public void loadService() {
        System.out.println("You logged in as Student");
    }

}
