package decoratorPattern;

public class Chocolate extends IceCreamDecorator {

	 Chocolate(IceCream c) {
		super(c);
	}
	 @Override
		public double getCost() {
			// TODO Auto-generated method stub
			return c.getCost() + 30;
		}

		@Override
		public String getDetail() {
			// TODO Auto-generated method stub
			return c.getDetail()+" + Added with Choclate";
		}

}
