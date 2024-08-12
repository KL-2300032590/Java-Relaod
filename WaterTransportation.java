package project;

public class WaterTransportation extends Logisticks {

	@Override
	public Transportation createTransportof() {
		return new Ship();
	}

}
