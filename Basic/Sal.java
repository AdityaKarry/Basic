import java.util.Scanner;

class Sal
{
	Emp e = new Emp();
	float basic;
	float pf;
	float hra;
	float total;

	public String getPaySlip()
	{
		
		basic = e.basic;
		System.out.println(e.getDetail());
		return "basic "+e.basic+" total:"+(e.basic+(0.35*e.basic)-(0.02*e.basic)+
		" PF:"+(0.02*e.basic)+" HRA:"+(0.35*e.basic));
	}

	public static void main(String args[])
	{
		Sal s = new Sal();
		System.out.println(s.getPaySlip());
	}
}
