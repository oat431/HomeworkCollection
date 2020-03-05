package app;
public class Person{
    private String name;

    public Person(){
        this.name = "No name yet.";
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void print(){
        System.out.println("Name " + this.name);
    }

    public boolean equals(Employee p){
        return this.name.equals(this.name);
    }
}