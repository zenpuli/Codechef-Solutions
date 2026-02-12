import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int flag=0;
        for(int i=0;i<size;i++){
            if(arr[i]==key)
                flag++;
        }
        if(flag>=1)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
	}
}
