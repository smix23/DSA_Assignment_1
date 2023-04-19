import java.util.Scanner;
public class a1q5
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter an Integer: ");
        int a = scan.nextInt();

        System.out.print("Sum of digits of "+a+" until the number is a single digit is "+ sum_Of_Digits(a));


        scan.close();

    }

    public static int sum_Of_Digits(int n) 
    {
       int sum = 0;
    
      while (n>9) 
      {
        sum = 0;
        
        while (n>0)
        {
            sum += n % 10;
            n /= 10;
        }
        
        n = sum;
      }
    
       return n;
    }

}
