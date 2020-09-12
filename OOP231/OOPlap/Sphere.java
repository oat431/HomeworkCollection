public class Sphere extends ThreeDimensionalShape{

    public Sphere(double r){
        super(r);
    }

	@Override
	public String convertToString() {
		return "Sphere";
	}

	@Override
	public double calculateVolume() {
		return (4/3) * Math.PI * this.length * this.length * this.length;
	}

}
