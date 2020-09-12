import java.util.ArrayList;

public class Customer {
    //declare Customer Attribute for Customer type
    private String name;
    private String customerType;
    private int money;
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<String> history = new ArrayList<>();

    //default constructor
    public Customer(){}

    //Customer constructor that require name , how many year you live , and Customer money
    public Customer(String name, int live, int money) {
        this.name = name;
        this.money = money;

        if(live > 10){
            this.customerType = "VIP";
        }else if(live >= 5 && live < 10){
            this.customerType = "Diamond";
        }else{
            this.customerType = "Normal";
        }

    }

    //Check for Type of Customer when you buy a car you will have change the Customer type
    public void check(){
        if(this.cars.size() >= 4 && this.customerType.equals("Normal")){
            this.customerType = "Diamond";
        }else if(this.cars.size() > 10 && this.customerType.equals("Diamond")){
            this.customerType = "VIP";
        }
    }

    //This method is for buy car and give warning to those Customer who not have enough money to buy car
    public void buyCar(Car car){
        double finalPrice = 0;
        switch (this.customerType){
            case "VIP":
                finalPrice = car.getPrice() * 0.5;
                if(this.money < finalPrice){
                    System.out.println(this.name + " Cannot Buy this Car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
            case "Diamond" :
                finalPrice = car.getPrice() * 0.75;
                if(this.money < finalPrice){
                    System.out.println(this.name + " Cannot Buy this Car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
            case "Normal" :
                finalPrice = car.getPrice();
                if(this.money < finalPrice){
                    System.out.println(this.name + " Cannot Buy this Car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
        }
        this.money -= finalPrice;
        if(this.money < 0){
            this.money = 0;
            return;
        }
        cars.add(car);
        check();
        ShowRoom.addIncome((int)finalPrice);
        history.add("You buy " + car.toString());
    }

    //This method is for down the car
    public void down(Car car){
        double finalDown = 0;
        switch (this.customerType){
            case "VIP":
                finalDown = car.getDowner() * 0.7;
                if(this.money < finalDown){
                    System.out.println(this.name+" Cannot Down This car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
            case "Diamond" :
                finalDown = car.getDowner() * 0.75;
                if(this.money < finalDown){
                    System.out.println(this.name+" Cannot Down This car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
            case "Normal" :
                finalDown = car.getDowner();
                if(this.money < finalDown){
                    System.out.println(this.name+" Cannot Down This car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
        }
        this.money -= finalDown;
        if(this.money < 0){
            this.money = 0;
            return;
        }
        cars.add(car);
        int money = (car.getPrice() - car.getDowner()) / car.getWithin();
        ShowRoom.addIncome((int)finalDown);
        history.add("You down " + car.toString() + " for " + car.getDowner() + " and gonna pay " + money +" Bath per month" );
    }

    //this method is for rent the car and require car that you want to rent and how long you gonna rent this car
    public void rent(Car car , int during){
        double finalRent = 0;
        double fine = 0;
        switch (this.customerType){
            case "VIP":
                finalRent = car.getRent() * 0.5;
                fine = 0;
                if(this.money < finalRent){
                    System.out.println(this.name + " Cannot rent this car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
            case "Diamond" :
                finalRent = car.getRent() * 0.75;
                fine = (during - car.getDuring()) * (car.getFine() * 0.3);
                if(this.money < finalRent){
                    System.out.println(this.name + " Cannot rent this car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
            case "Normal" :
                finalRent = car.getRent();
                fine = (during - car.getDuring()) * car.getFine();
                if(this.money < finalRent){
                    System.out.println(this.name + " Cannot rent this car " + car.toString());
                    ShowRoom.putCarBack(car);
                    return;
                }
                break;
        }
        if(fine < 0){
            fine = 0;
        }
        this.money -= finalRent;
        if(this.money < 0){
            this.money = 0;
            return;
        }
        cars.add(car);
        ShowRoom.addIncome((int)finalRent);
        history.add("You rent " + car.toString() + " for " + during + " day. you pay " + fine + " Bath");
    }

    //this method is for show history of transaction of Customer
    public void showHistory(){
        for(String i : history){
            System.out.println(i);
        }
    }

    //this method is for show the Car collections of Customer
    public void showCar(){
        for(Car i : cars){
            System.out.println(i.toString());
        }
    }

    //toString method of Customer for show information of Customer
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", customerType='" + customerType + '\'' +
                ", money=" + money +
                " Own " + this.cars.size() + " cars" +'}';
    }
}
