package app;

public class StudentEncapsulationExample1{
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String gender;

    public void SetFirstName(String n){this.firstName = n;}
    public void SetLastName(String n){this.lastName = n;}
    public void SetYearOfBirth(int y){
        if(2018 < y || y < 1950){
            System.out.println("The year of birth input appear to be invalid please enter again");}
        else{
            this.yearOfBirth = y;}
    }

    public void SetGender(String g){
        if(g.equals("Male")){
            this.gender = g;    }
        else if(g.equals("Female")){
            this.gender = g;    }
        else{System.out.println("invalid gender input. Only Male or Female is valid input");}    
    }

    public String GetFirstName(){
        if(this.firstName != null && !firstName.isEmpty()){
            return firstName;   }
        else {
            System.out.println("firstName value is not set please set the firstname for this object");
            return "";  }
    }

    public String GetLastName(){
        if(this.lastName != null && !lastName.isEmpty()){
            return lastName;   }
        else {
            System.out.println("LastName value is not set please set the lastname for this object");
            return "";  }
    }

    public int GetAge(){
        if(yearOfBirth != 0){
            return 2018 - yearOfBirth;  }
        else{
            System.out.println("Age is not available. Age will be valid after year of birth is set");
            return 0;}
    }

    public String GetGender(){
        if(this.gender != null && !gender.isEmpty()){
            if(gender.equals("Male")){return "Mr. ";}
            else { return "Ms. ";}   }
        else {
            System.out.println("Gender value is not set please set the gender for this object");
            return "";  }
    }

    public String GetStudentEncapsulationExample1(){
        return this.GetGender() + this.GetFirstName() + " " + this.GetLastName() + " age " + this.GetAge();
    }

}