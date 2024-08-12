package project;

public class Truck implements Transportation{
	 
	 
	@Override
	public double calculateTime(double t) {
		System.out.println("Time taken by truck");
	return  t/50;
			}

	@Override
	public double calculateCost(double c) {
		System.out.println("cost taken by truck");
		return c*20;
	}

}
