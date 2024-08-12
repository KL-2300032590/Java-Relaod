package decoratorPattern;

abstract class CoffeeDecorator implements Coffee
{
   protected Coffee c;
   protected CoffeeDecorator(Coffee c)  //second most imp* thing
   {
	   this.c=c;
   }
		@Override
		public double getCost() {
			
			return c.getCost();
		}
		@Override
		public String getDetail() {
			
			return c.getDetail();
		}
   
}
