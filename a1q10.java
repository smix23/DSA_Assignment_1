// Write a java program that reads a 3-by-4 matrix and displays the sum of each column

import java.util.Scanner;
public class a1q10 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);

        double [][]arr = new double [4][4];

        System.out.println("Enter a 3x4 matrix row by row: ");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                arr[i][j]= scan.nextDouble();
            }
        }

        for(int k=0;k<4;k++)
        {
		  System.out.println("Sum of the elements at column " +k+"  is  "+sumColumn(arr,k));

          scan.close();
        }

        
    }

    public static double sumColumn(double[][] m, int columnIndex)
    {
        double sum =0;
        
        for (int a=0; a<3; a++)
        {
            for (int b=0; b<4; b++)
            {
                if (b == columnIndex)
                sum = sum + m[a][b];
            }
        }

        return sum;



    }
    
}
