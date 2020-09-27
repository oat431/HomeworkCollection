

public class Circle extends TwoDimensionalShape{

   	public Circle(double r){
        super(r);
    }

	@Override
	public String convertToString() {
		return "Circle";
	}

	@Override
	public double calculateArea() {
		return Math.PI * this.length * this.length; 
	}

}
