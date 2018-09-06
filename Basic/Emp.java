import java.util.Scanner;
	
class Emp
{
	String name;
	int id;
	float basic;
	long mob_no;	
	public String getDetail()
	{
		Scanner sc = new Scanner(System.in);
		this.name = sc.next();
		this.id = sc.nextInt();
		this.basic = sc.nextFloat();
		this.mob_no = sc.nextLong();
		return "name:"+name+"id:"+id+" basic:"+basic+" mob_no:"+mob_no;
	}

	public static void main(String args[])
	{
		Emp e = new Emp();
		System.out.println(e.getDetail());
	}
}
