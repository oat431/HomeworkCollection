public class Car {
    //declare attribute of car
    private String band;
    private int price;
    private int during;
    private int rent;
    private int fine;
    private int downer;
    private int within;

    //default constructor
    public Car(){}

    //Car constructor that contain every attribute in Car type
    public Car(int price, int band,int during, int rent, int fine, int downer,int within){
        this.price = price;
        this.during = during;
        this.rent = rent;
        this.fine = fine;
        this.downer = downer;
        this.within = within;
        switch (band){
            case 1: this.band = "Tui"; break;
            case 2: this.band = "Tho"; break;
            case 3: this.band = "Toey"; break;
            case 4: this.band = "Jo"; break;
            case 5: this.band = "Pree"; break;
        }
    }

    //getter part
    public int getPrice() {
        return price;
    }

    public int getFine() {
        return fine;
    }

    public int getDowner() {
        return downer;
    }

    public int getRent() {
        return rent;
    }

    public String getBand() {
        return band;
    }

    public int getWithin() {
        return within;
    }

    public int getDuring() {
        return during;
    }

    //Overloading getBand for return as String specific type separate by no.
    public String getBand(int type) {
        switch (type){
            case 1: return "Tui";
            case 2: return "Tho";
            case 3: return "Toey";
            case 4: return "Jo";
            case 5: return "Pree";
        }
        return null;
    }

    //ToString method for Car output
    @Override
    public String toString() {
        return "Car{ Band : " + this.getBand() + " Price :" + this.getPrice() + '}';
    }
}
