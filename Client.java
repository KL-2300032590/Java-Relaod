package chainOfResponsibiltyPattern;

abstract class LeaveApprover
{
      protected LeaveApprover nextApprover;
      public void setnextApprover(LeaveApprover nextApprover)
      { this.nextApprover = nextApprover; }
      protected abstract boolean checkApprover(int days);
      protected abstract void Approve(int Days);
      
      public void ApproveLeave(int days) {
    	  if(checkApprover(days))
    	  { this.Approve(days);}
    	  else if(this.nextApprover != null)
    	  { this.nextApprover.Approve(days); }
    	  else 
    	  { System.out.println("the no of days which u can approved can't be appproved");}
    	  }
}

class TeamLead extends LeaveApprover
{  
	
	protected boolean checkApprover(int days) {
		return days <= 2?true:false; 
	}
	protected void Approve(int days) {
		System.out.println("Leave Approved for "+days+" Days by Team Lead");
	}
}

class Manager extends LeaveApprover
{ 
	protected boolean checkApprover(int days) {
		return days <= 5?true:false; 
	}
	 protected void Approve(int days) {
		 System.out.println("Leave Approved for "+days+" Days by Manager");
	}
}

class Director extends LeaveApprover
{
	protected boolean checkApprover(int days) {
		return days <= 10?true:false; 
	}
	protected void Approve(int Days) {
		System.out.println("Leave Approved for "+Days+" Days by Director");
	}
	
}

class classOfChainForLeave
{
	public static LeaveApprover CreateChain()
	{
		LeaveApprover teamLead = new TeamLead();
	    LeaveApprover manager = new Manager();
	    LeaveApprover director = new Director();
	    teamLead.setnextApprover(manager);
	    manager.setnextApprover(director);
	    director.setnextApprover(null);
	    return teamLead;
	}
}
public class Client {
    public static void main(String[] args)
    {
      LeaveApprover approveChainApprover= classOfChainForLeave.CreateChain();
      approveChainApprover.checkApprove(3)
            
    }
}
