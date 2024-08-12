package bridgePattern;

abstract class RemoteControl 
{
	private Device d;//bcoz this we have an aggregation
	protected RemoteControl(Device d)
	{
		this.d=d;
	}
	public abstract void on();
	public abstract void off();
	public abstract void volume(int v);

}
