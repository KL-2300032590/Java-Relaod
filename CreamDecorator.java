package decoratorPattern;

public class CreamDecorator extends CoffeeDecorator{

	public CreamDecorator(Coffee c) {
		super(c);
	}

		@Override
		public double getCost() {
			
			return c.getCost()+20;
		}
		@Override
		public String getDetail() {
			
			return c.getDetail()+ " + Added with Cream";
		}

}
