import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // TODO Auto-generated method stub

        SimpleDateFormat df = new SimpleDateFormat("mm-dd-yyyy");

        ArrayList<Person> people;

        people = new ArrayList<Person>();

        try {

            people.add(new Person("Joe", 92422, df.parse("12-12-2010")));

            people.add(new Person("Joef", 24122, df.parse("1-12-2010")));

            people.add(new Person("Joee", 24922, df.parse("12-2-2010")));

        } catch (ParseException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

        Collections.sort(people, new Person.CompId());

        System.out.println("BY ID");

        for (Person p : people) {

            System.out.println(p.toString());

        }

        Collections.sort(people, new Person.CompDate(false));

        System.out.println("BY Date asc");

        for (Person p : people) {

            System.out.println(p.toString());

        }

        Collections.sort(people, new Person.CompDate(true));

        System.out.println("BY Date desc");

        for (Person p : people) {

            System.out.println(p.toString());

        }

        Collections.sort(people, new Comparator<Person>() {

            public int compare(Person p1, Person p2) {

                return Integer.valueOf(p1.id).compareTo(p2.id);

            }

        });

        System.out.println("BY ID");

        for (Person p : people) {

            System.out.println(p.toString());

        }

    }
}