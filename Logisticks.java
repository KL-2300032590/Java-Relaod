package project;

public abstract class Logisticks {
      public abstract Transportation createTransportof();
      //abstract method-- to delegate the responsibility for child classes
      //(define the body of child classes strictly)
      //We are bound to implement abstract methods in child classes
      public void planDelivery(double d) {    //concrete method
    	  Transportation ts = createTransportof();  
    	 //abstract method invoking inside the concrete
    	  double time = ts.calculateTime(d);
    	  double cost = ts.calculateCost(d);
    	  System.out.println("time :"+time);
    	  System.out.println("cost :"+cost);
      }
}
