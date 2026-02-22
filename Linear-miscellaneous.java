import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    b[i]=sc.nextInt();
		}
		 
		 int test_a=sc.nextInt();
		 int test_b=sc.nextInt();
		 boolean found=false;
		
		for(int i=0;i<n;i++){
		    if((test_a==a[i] && test_b==b[i]) || (test_b==a[i] && test_a==b[i]))
		        found=true;
		}
		
		if(found==true)
		    System.out.println("Yes");
		else
		    System.out.println("No");
		    
		sc.close();

	}
}
