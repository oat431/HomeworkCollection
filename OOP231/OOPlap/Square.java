public class Square extends TwoDimensionalShape{
	
	public Square(double x){
        super(x);
    }

	@Override
	public String convertToString() {
		return "Square";
	}

	@Override
	public double calculateArea() {
		return this.length * this.length;
	}
     
}
