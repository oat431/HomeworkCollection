public class Student{
    private String name;
    private String lastname;
    private String SID;

    public Student(String name, String lastname, String SID){
        this.name = name;
        this.lastname = lastname;
        this.SID = SID;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + " " + lastname + " " + SID;
    }
}