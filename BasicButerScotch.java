package decoratorPattern;

public class BasicButerScotch implements IceCream {
	

		@Override
		public double getCost() {
			// TODO Auto-generated method stub
			return 50;
		}

		@Override
		public String getDetail() {
			// TODO Auto-generated method stub
			return "Basic ButerScotch IceCream";
		}
}
