
package hello;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      String arr[]=new String[size];
      for(int i=0;i<size;i++)
      {
    	  arr[i]=s.next();
      }
      for(int i=0;i<size;i++)
      {
    	  System.out.println(arr[i]);
      }
	}

}
