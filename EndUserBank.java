package project;



public class EndUserBank {

	public static void main(String[] args) {
		
         Banker s2=  Banker.getobject();
        
         Banker s3 = Banker.getobject();
        System.out.println(s2.equals(s3));
        
	}

}
