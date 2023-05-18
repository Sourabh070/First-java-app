package app;

import utility.*;

public class PerEmpWageDemo {

	public static void main(String[] args) {
		
		Person p1[] = new Person[3];
		
		p1[0] = new Person("Seeta",20);
		p1[1] = new Emp("Seeta",20,101,10000);
		p1[2] = new WageEmp("Seeta",20,101,10000,100,50);
		
		
		
		
		for(int i = 0; i<p1.length; i++)
		{
			System.out.println(p1[i]);
		}
		
		
		
		
	}

}
