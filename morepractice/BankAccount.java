package app;
public class BankAccount{
    private String account_ID;
    private String account_Name;
    private double account_balance;
    private int round;

    public BankAccount(String account_ID, String account_Name,double firstTransaction) {
        
        if(account_ID == null || account_Name == null){
            System.out.println();
            System.out.println("========== something wrong happend =======");
            System.out.println("please fill your name");
            System.out.println("==========================================");
            System.out.println();
        }else if(!chkID(account_ID) && !chkName(account_Name)){
            System.out.println();
            System.out.println("========== something wrong happend =======");
            System.out.println("Name or Id are invalid please check again");
            System.out.println("==========================================");
            System.out.println();
        }else if(firstTransaction < 100){
            System.out.println();
            System.out.println("========== something wrong happend =======");
            System.out.println("need more money to open the account");
            System.out.println("==========================================");
            System.out.println();
        }else{
            this.account_ID = account_ID;
            this.account_Name = account_Name;
            this.account_balance = firstTransaction;
        }

    }

    private boolean chkID(String id){
        if(id.length() != 10){
            return false;
        }
        if(id.matches("-?\\d+(\\.\\d+)?")){
            return true;
        }
        return false;
    }
    
    private boolean chkName(String name){
        return name.matches("[a-zA-z]+");
    }

    public String showInfomation(){
        return "Account name : "+this.getAccount_Name() + "ID: " +this.getAccount_ID() 
                + "\nAccount Balace :" + this.account_balance + "BATH";
    }

    private String getAccount_ID() {
        return account_ID;
    }

    private String getAccount_Name() {
        return account_Name;
    }

    private void finishTrasaction(){
        System.out.println();
        System.out.println("You have finish the trasaction you have " + this.account_balance + " bath in your account");
        System.out.println();
    }

    public void withdraw(double cash){

        if(!chkTrasaction(cash)){
            System.out.println();
            System.out.println("========== !!!! WARNNIG!!!! =======");
            System.out.println("    you require too much or too low transaction please");
            System.out.println("    require at least 100 BATH or not above 200000 BATH");
            System.out.println("==========================================");    
            System.out.println();
            return ;
        }

        if(cash > this.account_balance){
            System.out.println();
            System.out.println("========== !!!! WARNNIG!!!! =======");
            System.out.println("    you don't have enough money to do this transaction");
            System.out.println("==========================================");    
            System.out.println();
            return ;
        }
        this.round++;
        this.account_balance -= cash;
        if(this.round == 4){
            System.out.println("You have withdraw 4 times");
            this.account_balance -= 25;
            this.round = 0;
        }
        System.out.println("you withdraw " + cash + " BATH");
        finishTrasaction();
    }

    public void deposit(double cash){
        if(!chkTrasaction(cash)){
            System.out.println();
            System.out.println("========== !!!! WARNNIG!!!! =======");
            System.out.println("    you require too much or too low transaction please");
            System.out.println("    require at least 100 BATH or not above 200000 BATH");
            System.out.println("==========================================");    
            System.out.println();
            return ;
        }
        System.out.println("you deposit " + cash + " BATH");
        this.account_balance += cash;
        finishTrasaction();
    }

    public boolean chkTrasaction(double cash){
        if(cash >= 100 && cash <= 200000 ){
            return true;
        }
        return false;
    }

}