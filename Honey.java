package decoratorPattern;

public class Honey extends CoffeeDecorator{

	public Honey(Coffee c) {
		super(c);
	}

		@Override
		public double getCost() {
			
			return c.getCost()+30;
		}
		@Override
		public String getDetail() {
			
			return c.getDetail()+ " + Added with Honey";
		}

}
