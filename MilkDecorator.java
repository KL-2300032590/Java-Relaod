package decoratorPattern;

public class MilkDecorator extends CoffeeDecorator
{

	public MilkDecorator(Coffee c) {
		super(c);
	}
	@Override
	public double getCost() {
		
		return c.getCost()+10;
	}
	@Override
	public String getDetail() {
		
		return c.getDetail()+ " + Added with Milk";
	}
     
}
