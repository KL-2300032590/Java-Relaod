package project;

public class Ship implements Transportation {

  
	public double calculateTime(double t) {
		System.out.println("Time taken by ship");
	return  t/100;
			}

	@Override
	public double calculateCost(double c) {
		System.out.println("cost taken by ship");
		return c*10;
	
	}

}
