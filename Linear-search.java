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
		
		int find=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		 
		for(int i=0;i<n;i++){
		    if(a[i]==find)
		        found=true;
		}
		
		if(found==true)
		    System.out.println("Yes");
		else
		    System.out.println("No");
		    
		sc.close();
		    

	}
}
