package decoratorPattern;

public class HassleNuts extends IceCreamDecorator {

	HassleNuts(IceCream c) {
		super(c);
	}
	 @Override
		public double getCost() {
			// TODO Auto-generated method stub
			return c.getCost() + 40;
		}

		@Override
		public String getDetail() {
			// TODO Auto-generated method stub
			return c.getDetail()+" + Added with HassleNuts";
	}

}
