package hello;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		String str[]=new String[size];
		for(int i=0;i<str.length;i++)
		{
			str[i]=s.next();
		}
		////-------suraj---------------
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println(str[i]);
				}
			
			}
		}
	}

}
