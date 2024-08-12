package SingletonPattern;

public class singletonTester {

	public static void main(String[] args) {
		
          singleton s2= singleton.getobject();
         s2.setX(20);
         singleton s3 = singleton.getobject();
         System.out.println(s3.getX());
	}

}
