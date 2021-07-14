package Model;

import Service.Registration;
import Service.User;

public class Authentication implements Registration {
    private String username;
    private String password;
    private User user;

    public Authentication(String user,String pass){
        this.username = user;
        this.password = pass;
        login();
    }

    @Override
    public void login() {
        if (this.username.equals("Student") && this.password.equals("Student")) {
            this.user = new Student();
        }else if (this.username.equals("Teacher") && this.password.equals("Teacher")) {
            this.user = new Teacher();
        }
    }

    @Override
    public void getService(){
        this.user.loadService();
    }

}
