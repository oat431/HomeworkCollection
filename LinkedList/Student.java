public class Student{
    private String firstName;
    private String lastName;
    private String id;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student [id="+id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    
    
}