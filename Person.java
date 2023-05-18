package utility;

public class Person {
	
	private String name;
	private int age;
	
	public Person()
	{
		
	}
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public String toString()
	{
		return "Age - "+ age + "\t" + "Name - "+name;
	}

}
