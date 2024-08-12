package observer;
// mainly used in main driven programs
import java.util.ArrayList;
import java.util.Iterator;

interface SubjectClass  //whether Station
{
	void notifyObservers();
	void attach(Iobserver o);    //who r being able to attach and count doesnt matter
	void detach(Iobserver o);  // any object that pass through this it implement the instance

}

interface Iobserver
{
	void update(double t, double h,double p);
}

class WhetherStation implements SubjectClass
{
	private ArrayList<Iobserver> os;
	private double t,h,p;
	public WhetherStation(){
		  os = new ArrayList<Iobserver>(); 
	}
	public void setParameters(double t,double h,double p) {
		this.h=h;
		this.t=t;
		this.p=p;
		this.notifyObservers();
	}
public void notifyObservers() {  //picking each observer and envovke with that
  for(Iobserver o : os) {o.update(t, h, p);}
																//  Iterator<Iobserver> i =os.iterator();
																//  while(i.hasNext()) {
															//	  i.next().update(t, h, p);
																//  }
}
public void attach(Iobserver o) {
    os.add(o);
}
public void detach(Iobserver o) {
  os.remove(0);
}
}

class phoneDisplay implements Iobserver
{
	private SubjectClass ws;
	public phoneDisplay(SubjectClass ws) {
			this.ws=ws;
			ws.attach(this);}
	public void update(double t, double h, double p) {
	    System.out.println("Updating phone display with "+ h + " "+t +" "+p);
	}
}

class ComputerDesktop implements Iobserver
{
	private SubjectClass ws;
	public ComputerDesktop(SubjectClass ws) {
		this.ws=ws;
		ws.attach(this);
	}
	public void update(double t, double h, double p) {
		  System.out.println("Updating COmputer's Desktop with "+ h + " "+t +" "+p);	
	}
}

public class Enduser {
		public static void main(String[] args) 
		{
			
			WhetherStation ws = new WhetherStation();
			Iobserver d1 = new phoneDisplay(ws);
			Iobserver d2 = new ComputerDesktop(ws);ws.detach(d2);
			
			 ws.setParameters(32.5,12.5,56);
			ws.attach(d2);
			ws.setParameters(23, 42.5, 34.2);
			
		}
}