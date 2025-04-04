package Baisc_java_program;


/*
 * 62. Sum of First N Perfect Squares
Description: Write a program to calculate the sum of the first n perfect squares.
Input: n = 4


Output: 30



 */
import java.util.*;

public class Sum_of_first_n_perfect_square 
{
    public static void main(String  x[])
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the limit (n):");
        int n = s.nextInt();  
        
        int sum = 0;  
        
        for (int i = 1; i <= n; i++) 
        {
            sum += i * i;  
        }
        
        System.out.println("The sum of the first " + n + " perfect squares: " + sum);
    }
}
