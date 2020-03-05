package app;

import java.util.ArrayList;

public class Bank{
    private ArrayList<BankAccount> bankacc;
    private int book;

    public Bank(){
        bankacc = new ArrayList<>();
        book = 0;
    }

    public void openAccount(int a){
        book++;
        BankAccount bnAc = book%2==0?new SavingAccount(a) : new CurrentAccount(a);
        bankacc.add(bnAc);
    }

    public void closingAccount(int a){
        int index = 0;
        for(BankAccount i : bankacc){
            if(a == i.getAccountNumber()){
                bankacc.remove(index);
                return ;
            }
            index++;
        }
        System.out.println("not found");
    }

    public void update(){
        for(BankAccount i : bankacc){
            if(i.getClass().getName().equals("app.SavingAccount")){
                System.out.println("This update give " + (i.getInterest() * i.getBalance()) + " Bath To saving account");
                i.deposit(i.getInterest() * i.getBalance());
            } else if(i.getClass().getName().equals("app.CurrentAccount")){
                if(i.checkOD()){
                    System.out.println("This CurrentAccount is withdrawable ");
                }else{
                    System.out.println("Full OD");
                }
            }
        }
    }

    public void payDivide(){
        for(BankAccount i : bankacc){
            i.deposit(500);
        }
    }

    public void showInformation(){
        for(BankAccount i : bankacc){
            System.out.println(i.toString());
        }
    }

    public BankAccount pickacc(int p){
        return this.bankacc.get(p);
    }

}