/*Write a Java program that takes two arrays a and b of length n storing int values, 
and returns the dot product of a and b.
That is, it returns an array c of length n such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1. */

import java.util.Scanner;

public class a1ha3 
{
    public static void main(String[] args) 
    {
        Scanner Scanner=new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int n=Scanner.nextInt();
		int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
		System.out.print("Enter elements of array a : ");
		for (int i=0;i<n;i++)
		    a[i]=Scanner.nextInt();
        System.out.print("Enter elements of array b : ");
        for (int j=0;j<n;j++)
            b[j]=Scanner.nextInt();
		System.out.println("Array c of having dot product is : ");
		for (int k=0;k<n;k++)
		{
            c[k]=a[k]*b[k];
		    System.out.print(c[k]+" ");	
		}
		Scanner.close();	

        
    }
    
}
