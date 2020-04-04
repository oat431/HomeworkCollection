package app;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String studentId;

    public String ShowStudentInfo()
    {
        return this.gender + this.firstName + " " +this.lastName + " " + age + " " + studentId;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public void getStudentId() 
    {
        System.out.print("\n"+studentId);
        if(studentId.length() == 9){
            String a = studentId.substring(0,2);
            String b = studentId.substring(2,4);
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);
            if(c == 62){
                System.out.print(" 62 = 1st year ");
                if(d == 11){
                    System.out.print(" 11 = AMS");
                }
                else if(d == 19){
                    System.out.print(" 19 = POL");
                    
                }
                else if(d == 20){
                    System.out.print(" 20 = LAWS");
                    
                }
                else if(d == 21){
                    System.out.print(" 21 = CAMT");
                    
                }
                else{System.out.println("not found");}
            }
            else if(c == 61){
                System.out.print(" 61 = 2nd year ");
                if(d == 11){
                    System.out.print(" 11 = AMS");
                }
                else if(d == 19){
                    System.out.print(" 19 = POL");
                    
                }
                else if(d == 20){
                    System.out.print(" 20 = LAWS");
                    
                }
                else if(d == 21){
                    System.out.print(" 21 = CAMT");
                    
                }
                else{System.out.println("not found");}
            }
            else if(c == 60){
                System.out.print(" 60 = 3rd year ");
                if(d == 11){
                    System.out.print(" 11 = AMS");
                }
                else if(d == 19){
                    System.out.print(" 19 = POL");
                    
                }
                else if(d == 20){
                    System.out.print(" 20 = LAWS");
                    
                }
                else if(d == 21){
                    System.out.print(" 21 = CAMT");
                    
                } 
                else{System.out.println("not found");}
            }
            else if(c == 59){
                System.out.print(" 59 = 4th year ");
                if(d == 11){
                    System.out.print(" 11 = AMS");
                }
                else if(d == 19){
                    System.out.print(" 19 = POL");
                    
                }
                else if(d == 20){
                    System.out.print(" 20 = LAWS");
                    
                }
                else if(d == 21){
                    System.out.print(" 21 = CAMT");
                    
                }
                else{System.out.println("not found");}
            }
            else if(c == 58){
                System.out.print(" 58 = 5th year ");
                if(d == 11){
                    System.out.print(" 11 = AMS");
                }
                else if(d == 19){
                    System.out.print(" 19 = POL");
                    
                }
                else if(d == 20){
                    System.out.print(" 20 = LAWS");
                    
                }
                else if(d == 21){
                    System.out.print(" 21 = CAMT");
                    
                }
                else{System.out.println("not found");}
            } 
            else{System.out.println("not found");}  
        }

        else{
            System.out.print(" is invalid student ID ");
            
        }
        
    }

    public void SetStudentId(String studentId) 
    {
        this.studentId = studentId;
    }
}