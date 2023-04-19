// WAP that outputs all possible strings formed by using the characters 'c','a','r','b','o',and'n' exactly once.

public class a1q4 
{
    public static void main(String[] args) 
    {
        String input = "carbon";
        permutation(input, "");
    }
    
    public static void permutation(String input, String soFar) 
    {
        if (input.length() == 0) 
        {
            System.out.println(soFar);
        } 
        else 
        {
            for (int i = 0; i < input.length(); i++) 
            {
                String remaining = input.substring(0, i) + input.substring(i+1);
                permutation(remaining, soFar + input.charAt(i));
            }
        }
    }
}