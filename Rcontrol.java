package bridgePattern;

public class Rcontrol extends RemoteControl
{
    
	public Rcontrol(Device d) {
		super(d);
		
	}

	public void on() {this.d.on();}

	@Override
	public void off() {
		this.d.off();
		
	}

	@Override
	public void volume(int v) {
		// TODO Auto-generated method stub
		System.out.println("Volume is"+v);
	}
	

}
