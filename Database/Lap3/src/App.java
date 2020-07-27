import java.sql.*;
import java.util.Scanner;
public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/humandata", "root", "1590");

        Statement state = con.createStatement();
        System.out.print("Enter your name:");
        String name = in.nextLine();

        System.out.print("Enter your nickname:");
        String nickname = in.nextLine();

        System.out.print("Enter your year of birth:");
        String year = in.nextLine();

        System.out.print("Enter your month of birth:");
        String month = in.nextLine();

        System.out.print("Enter your day of birth:");
        String day = in.nextLine();

        String insert = "INSERT INTO basic_infomation(personal_name,personal_nickname,personal_birthday)" +
                        "value(" + name + "," + nickname +","+ year + "-" + month + "-" + day +")";

        ResultSet res = state.executeQuery(insert);

        res.getMetaData();
    }
}
