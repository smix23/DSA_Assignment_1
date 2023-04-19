//Write a method that sums all the numbers in the major diagonal in an n * n matrix of double values
/*Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal.*/

import java.util.Scanner;
public class a1q9 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        
        double [][]arr= new double[4][4];

        System.out.println("Enter a 4x4 matrix: ");
        for (int m=0; m<4; m++)
        {
            for (int n=0; n<4; n++)
            {
                arr[m][n] = scan.nextInt();
            }
        }

        double add = sumMajorDiagonal(arr);

        
        
        System.out.println("The sum of the elements on the major diagonal is " + add);

        scan.close();


        

    }
    
    public static double sumMajorDiagonal(double[][] m)
    {
      double sum = 0.0;
      for (int i = 0; i < m.length; i++) 
      {
        sum += m[i][i];
      }

     return sum;
    }
}