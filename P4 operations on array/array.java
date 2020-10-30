import java.io.*;
import java.util.*;
public class array
{	public static void main(String[] args)throws IOException
{
		Scanner Sc=new Scanner(System.in);
		double total=0;
		System.out.println("Name : Badal");
		System.out.println("RollNo - 1816113015\n");
		System.out.println("Enter Size of Array");
		int n=Sc.nextInt();
		double a[] = new double[n];
		System.out.println("Enter Array Elemnts");
		for(int i=0;i<n;i++)
		{	a[i]=Sc.nextInt();
		}
		System.out.println("\nThe Elements that you have entered are :\n");
		for(int i=0;i<a.length;i++)
		{	System.out.println((i+1)+" . "+a[i]);		
		}	
		for(int i=0;i<a.length;i++)
		{	total=total+a[i];		
		}
		System.out.println("\nTotal = "+total+"\n");
        double average=total/a.length;
		System.out.println("Average = "+average+"\n");
		double max=a[0];
		for(int i=1;i<a.length;i++)
		{	if(a[i]>max)
			{	max=a[i];
			}		
		}
		System.out.println("Max. is = "+max+"\n");	
		double min=a[0];
		for(int i=1;i<a.length;i++)
		{	if(a[i]<min)
			{	min=a[i];
			}		
		}
		System.out.println("Min. is = "+min+"\n");
}
}
