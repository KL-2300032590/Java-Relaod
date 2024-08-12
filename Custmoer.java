package decoratorPattern;

public class Custmoer 
{
	public static void main(String[] args)
	{   
		Coffee  c = new BasicCoffee();
		System.out.println("Cost : "+c.getCost());
		System.out.println("Detail : "+c.getDetail());
		c = new MilkDecorator(c);
		System.out.println("Cost : "+c.getCost());
		System.out.println("Detail : "+c.getDetail());
		
		c = new Honey(c);
		System.out.println("Cost : "+c.getCost());
		System.out.println("Detail : "+c.getDetail());
		c = new BasicCoffee();
		System.out.println("Cost :"+c.getCost()+ "\n" + "Detail : "+c.getDetail());
		
		
	}
     
}
