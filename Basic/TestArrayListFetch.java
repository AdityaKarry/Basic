import java.util.*;
import java.io.*;

class TestArrayListFetch
{
	static String str;
	public static void main(String args[])throws Exception
	{	int sr = 0;
		Scanner sc = new Scanner(new File("test/filetest.txt"));
		Scanner sc1 = new Scanner(new File("test/filetest1.txt"));
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter index to search");
		int index = scn.nextInt();
		str = Integer.toString(index);
		ArrayList<String> l = new ArrayList<String>();
		ArrayList<String> l1 = new ArrayList<String>();
		while(sc.hasNext()&&sc1.hasNext())
		{
			l.add(sc.next());
			l1.add(sc1.next());
		}
		System.out.println();
		for(String al : l)
		{
			if(al.contains(str))
                	{
                		System.out.println("Value corresponding to the searched index is : "+l1.get(index-1));
			}

		}
		sc.close();
	}
}
