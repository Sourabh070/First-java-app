package utility;

public class WageEmp extends Emp{
	
	private float hours;
	private float rate;
	
	public WageEmp()
	{
		
	}
	public WageEmp(String n, int a,int id, float s, float h, float r)
	{
		super(n, a, id, s);
		hours = h;
		rate = r;
	}
	
	public String toString()
	{
		return super.toString() + "\t" + "Hours - "+hours + "\t" + "Rate - "+rate;
	}
	

}
