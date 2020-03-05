package app;

public class BankAccount{
    private double bal;
    private int accnum;

    public BankAccount(int a){
        this.bal = 0.0;
        this.accnum = a;
    }
    
    public void deposit(double sum){
        if(sum < 0){
            return;
        }
        this.bal += sum;
    }

    public void withdraw(double sum){
        if(sum < 0){
            return;
        }
        this.bal -= sum;
    }

    public double getBalance(){
        return this.bal;
    }

    public int getAccountNumber(){
        return this.accnum;
    }

    public String toString(){
        return "Acc " + this.accnum + ": " + "balance = " +this.bal;
    }
    
    public final void print(){
        System.out.println(this.toString());
    }
    
    public void addInterest(double e){
        System.out.println("something");
    }

    public boolean checkOD(){
        return true;
    }

    public double getInterest(){
        return 0.00;
    }
}