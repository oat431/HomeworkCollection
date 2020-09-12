import java.util.Comparator;
import java.util.Date;

public class Person {

    public String name;

    public int id;

    public Date hireDate;

    private int Age;

    public void SetAge(int a) {
        this.Age = a;
    }

    public int GetAge() {
        return this.Age;
    }

    public Person(String iname, int iid, Date ihireDate) {

        name = iname;

        id = iid;

        hireDate = ihireDate;

    }

    public String toString() {

        return name + " " + id + " " + hireDate.toString();

    }

    // Comparator

    public static class CompId implements Comparator<Person> {

        @Override

        public int compare(Person arg0, Person arg1) {

            return arg0.id - arg1.id;

        }

    }

    public static class CompDate implements Comparator<Person> {

        private int mod = 1;

        public CompDate(boolean desc) {

            if (desc)
                mod = -1;

        }

        @Override

        public int compare(Person arg0, Person arg1) {

            return mod * arg0.hireDate.compareTo(arg1.hireDate);

        }

    }

}