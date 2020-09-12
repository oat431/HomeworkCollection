

public class Cube extends ThreeDimensionalShape{

    public Cube(double x){
        super(x);
    }

	@Override
	public String convertToString() {
		return "Cube";
	}

	@Override
	public double calculateVolume() {
		return this.length * this.length * this.length;
	}

}
