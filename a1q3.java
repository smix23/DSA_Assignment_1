// Write a java program to check whether a number is a spy number or not

import java.util.Scanner;
public class a1q3
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter an Integer: ");
        int n = scan.nextInt();

        int sum=0;
        int product=1;

        while (n>0)
        {
            int x = n%10;
            sum = sum+x;
            product = product+x;
            n=n/10;
        }

        if(sum == product)
        {
            System.out.println("it is a spy number");
        }
        else
        {
            System.out.println("it is not spy number");
        }


        scan.close();

    }     

}