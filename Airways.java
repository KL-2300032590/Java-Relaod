package project;

public class Airways extends Logisticks {

	@Override
	public Transportation createTransportof() {
		System.out.println("Welcome to airways");
		return new Aeroplane();

	}
	}
