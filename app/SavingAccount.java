package app;
public class SavingAccount extends BankAccount{
    private double interest;
    public SavingAccount(int a){
        super(a);
        this.interest = 0.075;
    }

    @Override
    public void addInterest(double e){
        this.interest += e;
    }

    @Override
    public double getInterest(){
        return this.interest;
    }

    @Override
    public String toString() {
        return  "\nThis is the SavingAccount: \nBalance " + this.getBalance() + "\nhave interest " + this.getInterest() + " Per year" + " Account No." + this.getAccountNumber() +"\n";
    }

    
}