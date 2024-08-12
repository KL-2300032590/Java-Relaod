abstract class Company
{
      protected Company nextApprover;
      public void setnextApprover(Company nextApprover)
      { this.nextApprover = nextApprover; }
      protected abstract boolean checkApprover(int days);
      protected abstract void Approve(int Days);
      
      public void ApproveLeave(String s) {
    	  if(checkApprover(days))
    	  { this.Approve(days);}
    	  else if(this.nextApprover != null)
    	  { this.nextApprover.Approve(days); }
    	  else 
    	  { System.out.println("the no of days which u can approved can't be appproved");}
    	  }
}

class Level1 extends Company
{  
	
	protected boolean checkApprover(String s) {
		return(s.equalsIgnoreCase("Basics"))? true:false;
	}
	protected void Approve(int days) {
		System.out.println("the issue is  "+days+" so solved by Level1");
	}
}

class Level2 extends Company
{ 
	protected boolean checkApprover(int days) {
		return(s.equalsIgnoreCase("Intermediate"))? true:false;
	}
	 protected void Approve(String s) {
		 System.out.println("the Issue is "+s+" so solved by Level2");
	}
}

class Level3 extends Company
{
	protected boolean checkApprover(String s) {
		return(s.equalsIgnoreCase("Complex"))? true:false;
	}
	protected void Approve(String s) {
		System.out.println("the Issue is   "+	s+" so solved by Level3");
	}
	
}

class classOfChainForLe1av   
{
	public static Company CreateChain()
	{
		Company l1 = new Level1();
	    Company l2 = new Level2();
	    Company l3 = new Level3();
	    l1.setnextApprover(l2);
	    l2.setnextApprover(l3);
	    l3.setnextApprover(null);1
	    return l1;
	}
}
public class Client2 {
    public static void main(String[] args)
    {
      Company approveChainApprover= classOfChainForLeave.CreateChain();
      approveChainApprover.Approve(3);
            
    }
}