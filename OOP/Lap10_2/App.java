package app;
public class App {
    public static void main(String[] args) throws Exception {
        // Bank oat = new Bank();

        // oat.openAccount(159536565);
        // oat.openAccount(753159846);
        // oat.openAccount(853168465);
        // oat.openAccount(156784365);
        // oat.openAccount(850008465);
        // oat.openAccount(156012355);

        // oat.pickacc(0).deposit(2500);
        // oat.pickacc(1).deposit(3000);
        // oat.pickacc(2).deposit(3500);
        // oat.pickacc(3).deposit(4000);
        // oat.pickacc(4).deposit(4500);
        // oat.pickacc(5).deposit(5000);

        // oat.update();
        // oat.payDivide();

        // oat.showInformation();
         

        Person Sahachan = new Employee("Sahachan", 750000.25, 12, "1629900563444");
        Person Tisan = new Employee("Tisarn","1235669988448");
        Sahachan.print();
        Tisan.print();

        System.out.println(Sahachan.equals(Sahachan));
    }
}