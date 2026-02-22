import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char find=sc.next().charAt(0);
		
	/*	boolean found=false;
		int s=0;
		
		for(int i=0;i<=str.length()-1;i++){
		    if(str.charAt(i)==find){
		        found=true;
		        s=i;
		    }t
		}if(found==true) */
		    System.out.println(str.lastIndexOf(find));
		sc.close();
	}
}
