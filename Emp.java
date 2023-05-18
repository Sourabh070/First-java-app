package utility;

public class Emp extends Person{
	
	private int eid;
	private float salary;
	
	public Emp()
	{
		
	}
	public Emp(String n, int a,int id, float s)
	{
		super(n,a);
		eid = id;
		salary = s;
	}
	
	public String toString()
	{
		return super.toString() + "\t" + "EID - "+eid + "\t" + "Salary - "+salary;
	}

}
