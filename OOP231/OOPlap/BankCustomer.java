public class BankCustomer extends Person{

    private BankAccount bankAccount;
    public BankCustomer(){}

    public BankCustomer(String name){
        this.name = name;
    }

    public void addBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

   @Override
    public void buyThings(float amount){
        float tmp = this.bankAccount.withdraw(amount);
        if(amount == tmp){
            System.out.println("I can pay for this item :)");
        }else{
            System.out.println("I don't have enough money to pay for it :(");
            this.bankAccount.deposit(tmp);
        }
    }

    @Override
    public void sellThings(float amount){
        this.bankAccount.deposit(amount);
    }

    @Override
    public void showInformation(){
        System.out.println("\tName : "+this.getName());
        this.bankAccount.displayBalance();
    }

}
