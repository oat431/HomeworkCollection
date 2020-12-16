public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car("Gray",75.0);
        myCar.brake(15.0);
        myCar.currentSpeed();
        
        myCar.speed(27.5);
        myCar.currentSpeed();
    }    
}


