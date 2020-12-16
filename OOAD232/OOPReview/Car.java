public class Car {
    private String color;
    private double speed; 
 
    public Car(String color,double speed){
        this.color = color;
        this.speed = speed;
    }

    public void brake(double speed){
        this.speed = this.speed - speed;
    }

    public void speed(double speed){
        this.speed = this.speed + speed;
    }

    public void currentSpeed(){
        System.out.println("This " + this.color + " car is running at " + this.speed);
    }
}


