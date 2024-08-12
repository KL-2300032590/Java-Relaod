package project;

public class EndUser {

	public static void main(String[] args) {
		
		Logisticks l =new RoadTransport();
		l.planDelivery(500);
		
		Logisticks l1 =new WaterTransportation();
		l1.planDelivery(500);
		 
		Logisticks l2 = new Airways();
		l2.planDelivery(900);		
	}
}
