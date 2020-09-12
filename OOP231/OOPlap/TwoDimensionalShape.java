public abstract class TwoDimensionalShape implements Shape{
    
    protected double length;
    
    public TwoDimensionalShape(double length) {
        this.length = length;
    }

    abstract public double calculateArea();
}