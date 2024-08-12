package SingletonPattern;

public class singleton {
	private static  int x;
   public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

private singleton() {
	   
   }
   private static singleton s1= null;
   
   public static singleton getobject() {
	   if(s1==null)return s1= new singleton();
	   else return s1;
   }
}
