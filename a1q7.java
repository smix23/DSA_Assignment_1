/*WAP to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.*/

import java.util.Scanner;
public class a1q7
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the array size: ");
        int n = scan.nextInt();

        int x[] = new int[n];

        System.out.println("Enter array elements: ");

       for(int i=0; i<n; i++)
        {
            x[i] = scan.nextInt();
        }

        int max = x[0];
        int min = x[0];
        int maxCount = 0;
        int minCount = 0;
        int maxpos = 0;
        int minpos =0;

        for (int j=0; j<n; j++)
        {
            if (x[j] > max)
            {
                max = x[j];
                maxCount = 1;
                maxpos=j;
            }
            else if (x[j] == max)
            {
                maxCount++;
            }

            if (x[j] < min)
            {
                min = x[j];
                minCount =1;
                minpos = j;
            }
            else if (x[j] == min)
            {
                minCount++;
                minpos = j;
            }
        }

        System.out.println("Maxmimum value: "+max);
        System.out.println("Max Occurs "+maxCount+ " times.");
        System.out.println("First occurs at position "+maxpos);
        System.out.println("Minimum value: "+min);
        System.out.println("Min Occurs "+minCount+ " times.");
        System.out.println("Last occurs at position "+minpos);

        scan.close();

        
    }
}