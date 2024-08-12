package decoratorPattern;
import java.util.Scanner;
public class IceShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  System.out.println("        Welcome To KL PolarBear         "+"\n"+
	        		 "  1 -- vanilia"+"\n"+
	        		 "  2 -- ButerScoth"+"\n"+
	        		 "  3 -- Vanilia with Choclate"+"\n"+
	        		 "  4 -- Vanilia with HassleNuts"+"\n"+
	        		 "  5 -- ButerScotch with Choclate"+"\n"+
	        		 "  6 -- Bute	rScotch with HassleNuts"+"\n"+
	                 "");
		  System.out.println(" press a number to get items");
		  int x=s.nextInt();
			switch(x) {
				
				case 1:  {IceCream c  =new BasicVanilia();
				System.out.println(c.getCost() +" "+ c.getDetail());
				     break;}
				
	                     
				case 2: {IceCream c =new BasicButerScotch(); System.out.println(c.getCost() +" "+ c.getDetail());break;}
	                    
				case 3: {IceCream c =new BasicVanilia();
	                                      c= new Chocolate(c); System.out.println(c.getCost() +" "+ c.getDetail());break;}
	                     
				case 4: {IceCream c =new BasicVanilia();
                                         c= new HassleNuts(c); c.getCost();c.getDetail();break;}
				case 5: {IceCream c =new BasicButerScotch(); 
			                  c = new Chocolate(c);System.out.println(c.getCost() +" "+ c.getDetail());;break; }
				case 6: {IceCream c =new BasicButerScotch();System.out.println(c.getCost() +" "+ c.getDetail());}
               default:{
	                    	 System.out.println("Thankyou");break;}
	}}
	}


