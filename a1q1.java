/*WAP that can take a positive integer greater than 2 as input and 
write out the number of times one must repeatedly divide this number 
by 2 before getting a value less than 2.*/

import java.util.Scanner;
public class a1q1
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = scan.nextInt();

        int count =0;

        while(n>2)
        {
            n=n/2;
            count++;

        }
        System.out.println(count);


        scan.close();




    }
}