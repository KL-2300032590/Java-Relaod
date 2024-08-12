package observer;

import java.util.ArrayList;

interface auctioner
{
	void notifybidders();
	void promote(bidders b);
	void eliminate(bidders b);
	
}

interface bidders
{
	void update(String name,double cost);
}

class selections implements auctioner
{
    private ArrayList<bidders> bs;
    private String name;
    private double cost;
    public selections() {
    	bs = new ArrayList<bidders>();
    }
    public void setParameters(String name,double cost) {
		this.name=name;
		this.cost=cost;
		this.notifybidders();}
	public void notifybidders() {
		for(bidders b : bs) {
			b.update(name,cost);
		}
	}

	@Override
	public void promote(bidders b) {
		bs.add(b);
	}
	public void eliminate(bidders b) {
	             bs.remove(b);
	}
}
class team1 implements bidders
{
	private  auctioner as;
	public void update(String name, double cost) {
	System.out.println("For team1 got in bidding  "+name +"with cost of "+cost);
	}
	public team1( auctioner as) {
		this.as=as;
		as.promote(this);
	}
	
}

class team2 implements bidders
{
	private  auctioner as;
	public void update(String name, double cost) {
	System.out.println("For team2 got in bidding  "+name +"with cost of "+cost);
	}
	public team2( auctioner as) {
		this.as=as;
		as.promote(this);
	}	
}

public class EndUser1 {
  public static void main(String[] args) {
	  selections s = new selections();
	  bidders d1 = new team1(s);
	  bidders d2 = new team1(s);
	  s.setParameters("Virat",1232440);
	  
}
}
