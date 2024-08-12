package bridgePattern;

public class Tv implements Device
{
	private boolean isOn=false;
	

	

	public void on() {
		// TODO Auto-generated method stub
		isOn=true;
           System.out.println("is it power on "+isOn);
	}

	
	public void off() {
		// TODO Auto-generated method stub
		System.out.println(" is it power on"+ isOn);
	}

	

	
	public void volume(int v) {
		// TODO Auto-generated method stub
		System.out.println("Volume :"+ v);
	}



}
