package Baisc_java_program;

/*
 * 54. Check for Perfect Cube
Description: Write a program to check if a number is a perfect cube.
Input: n = 27


Output: Perfect Cube

 */


import java.util.*;

public class check_for_perfect_cube
 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int n = s.nextInt();  
        
        boolean isPerfectCube = false;
        
        
        int cube=0;
        
        for (int i = 1; i <= n; i++)
        {
        	
        	cube=i*i*i;
        	
            if (cube == n)
            {
                isPerfectCube = true;
                break;
            }
        }
        
        if (isPerfectCube)
        {
            System.out.println("Perfect Cube");
        } 
        else 
        {
            System.out.println("Not a Perfect Cube");
        }

        
    }
}
