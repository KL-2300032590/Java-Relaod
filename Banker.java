package project;

public class Banker {

private Banker() {
	   
   }
   private static Banker s1= null;
   
   public static Banker getobject() {
	   if(s1==null)return s1= new Banker();
			   else return s1;
   }
}
