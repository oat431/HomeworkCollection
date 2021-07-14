import Model.Authentication;
import Service.Registration;

public class Guest {
    public static void main(String[] args) {
        Registration sahachan = new Authentication("Student","Student");
        Registration jayakrit = new Authentication("Teacher","Teacher");

        sahachan.getService();
        jayakrit.getService();
    }
}
