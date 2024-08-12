package project;

public class Aeroplane implements Transportation{

	@Override
	public double calculateTime(double t) {
		// TODO Auto-generated method stub
		return t/60;
	}

	@Override
	public double calculateCost(double c) {
		// TODO Auto-generated method stub
		return c/2;
	}

}
