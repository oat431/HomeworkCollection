import java.util.ArrayList;
import java.util.Random;
public class ShowRoom {
    //This attribute declare for Random the car in the ShowRoom
    private Random ran = new Random();

    //declare attribute for ShowRoom
    private static int income = 0;
    private ArrayList<Customer> cilent = new ArrayList<>();
    protected static ArrayList<Car> cars = new ArrayList<>(1000);

    //default constructor that when ShowRoom instantiate it will generate 1000 car for this ShowRoom
    public ShowRoom(){
        for(int i=0;i<1000;i++){
            int type = ran.nextInt(5)+1;
            int price = 0;
            int fine = 0;
            int rent = 0;
            int downner = 0;
            int during = 0;
            int within = 0;
            switch (type){
                case 1:
                    price = ran.nextInt(2000001) + 3000000;
                    rent = 5000;
                    fine = 100;
                    during = 18;
                    downner = ran.nextInt(400001) + 100000;
                    within = 10;
                    break;
                case 2:
                    price = ran.nextInt(1000001) + 2000000;
                    rent = 10000;
                    fine = 500;
                    during = 30;
                    downner = ran.nextInt(270000) + 80000;
                    within = 20;
                    break;
                case 3:
                    price = ran.nextInt(2000001) + 1000000;
                    rent = 2000;
                    fine = 250;
                    during = 10;
                    downner = ran.nextInt(300001) + 100000;
                    within = 8;
                    break;
                case 4:
                    price = ran.nextInt(500001) + 500000;
                    rent = 8000;
                    fine = 1000;
                    during = 60;
                    downner = ran.nextInt(400001) + 10000;
                    within = 6;
                    break;
                case 5:
                    price = ran.nextInt(80001) + 20000;
                    rent = 20000;
                    fine = 3000;
                    during = 200;
                    downner = ran.nextInt(7001) + 1000;
                    within = 4;
                    break;
            }
            Car car =  new Car(price,type,during,rent,fine,downner,within);
            cars.add(car);
        }
    }

    //This method for when Customer do some transaction with ShowRoom, ShowRoom will gain income
    public static void addIncome(int money){
        income += money;
    }

    //Show car in the Stock
    public void showCarInStock(){
        for(Car i : cars){
            System.out.println(i.toString());
        }
    }

    //Add Customer to ShowRoom List
    public void addRecord(Customer c){
        cilent.add(c);
    }

    //this method is for when transaction is incomplete
    public static void putCarBack(Car c){
        cars.add(c);
    }

    //this method require bands for get the correct car the customer want
    public Car getCar(int bands){
        int no = ran.nextInt(cars.size());
        Car obj = cars.get(no);
        while(!obj.getBand().equals(obj.getBand(bands))){
            no = ran.nextInt(cars.size());
            obj = cars.get(no);
        }
        cars.remove(no);
        return obj;
    }

    //this method is show information of Show room
    public void showInformation(){
        System.out.println("This shop has " + cars.size() + " cars");
        System.out.println("This shop gain " + income + " Bath");
    }

    //this method is show Customer list
    public void showCustomer(){
        for(Customer i : cilent){
            System.out.println("===============");
            System.out.println(i.toString());
            i.showHistory();
            System.out.println(i.toString());
            System.out.println("===============");
        }
    }
}
