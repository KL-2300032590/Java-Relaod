package project;

public class RoadTransport extends Logisticks{
  public Transportation createTransportof() {
	  return new Truck();
  }

  //child class obj can be refered by a super class reference but not viceversa 
  //an object of a classs can be refered by the interface that is implemented by 
}
