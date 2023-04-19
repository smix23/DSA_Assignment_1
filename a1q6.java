// WAP that takes an int i and returns true if and only if i is odd. 
//Your method can't use the multiplication, modulus, or division operators


import java.util.Scanner;
public class a1q6
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter an Integer: ");
        int i = scan.nextInt();

        System.out.println(i+ " is odd: "+isOdd(i));

        scan.close();

    }

    public static boolean isOdd(int n)
    {
        return (n & 1) == 1;
    }

}