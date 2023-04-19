//Write a java program by using conditional statement to show the category for a given BMI.

import java.util.Scanner;
public class a1q2
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter weight: ");
        double a = scan.nextDouble();
        System.out.print("Enter height in mtr: ");
        double b = scan.nextDouble();

        double bmi = a/Math.pow(b, b);

        if (bmi<=18.5)
        {
            System.out.println("Underweight");
        }
        else if (bmi>=18.5 && bmi<=24.9)
        {
            System.out.println("Normal Weight");
        }
        else if (bmi>=25.0 && bmi<=29.9)
        {
            System.out.println("Overweight");
        }
        else 
        {
            System.out.println("Obese");
        }

        scan.close();

    }

}