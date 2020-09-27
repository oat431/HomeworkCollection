public abstract class ThreeDimensionalShape implements Shape{
    
    protected double length;
    
    public ThreeDimensionalShape(double length) {
        this.length = length;
    }
    
    abstract public double calculateVolume();
}