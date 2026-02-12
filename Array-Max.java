import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test_cases=sc.nextInt();
		while(test_cases>0){
		    int size=sc.nextInt();
		    int arr[]=new int[size];
		    for(int i=0;i<size;i++)
		        arr[i]=sc.nextInt();
		    int max=0;
		    max=arr[0];
		    for(int i=1;i<size;i++){
		        if(arr[i]>=max)
		            max=arr[i];
		      
		    }
		    System.out.println(max);
		    test_cases--;
		}
    sc.close();
	}
}
