/* WAP to print M-by-N array in the tabular format. Also, display the sum of
elements of the array.*/

import java.util.Scanner;
public class a1q8
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter no. of rows: ");
        int m = scan.nextInt();
        System.out.println("Enter no. of columns: ");
        int n = scan.nextInt();

        int [][]arr = new int [m][n];

        System.out.println("Enter elememts of array: ");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nThe array in tabular format:");
        for (int i = 0; i<m; i++) 
        {
            for (int j=0; j<n; j++) 
            {
                System.out.printf("%-5d", arr[i][j]);
            }
            System.out.println();
        }

        int sum = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("\nThe sum of all elements in the array is: " + sum);

        scan.close();


    }
}