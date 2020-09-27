package app;

public class Student {
    private String ID;
    private String Title;
    private String Name;
    private String Surname;

    public Student(String ID, String title, String name, String surname) {
        this.ID = ID;
        this.Title = title;
        this.Name = name;
        this.Surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", Title='" + Title + '\'' +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }
}
