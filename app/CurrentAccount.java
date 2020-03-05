package app;
public class CurrentAccount extends BankAccount{
    private double overDraft;
    public CurrentAccount(int a){
        super(a);
        this.overDraft = 159700.0;
    }

    @Override
    public boolean checkOD(){
        return super.getBalance() < this.overDraft;
    }

    @Override
    public String toString() {
        return  "\nThis is the CurrentAccount: \nBalance " + this.getBalance() + "\nhave remaining OD " + (this.overDraft - this.getBalance()) + " Bath" + "Account No." + this.getAccountNumber()+"\n";
    }

}