/*
Q1. WAP to handle the ArithmeticException ?
Q2. WAP to handle the IOException ?
Q3. WAP to handle the InputMismatchException ?
Q4. WAP to handle the ClassNotFoundException ?
Q5. WAP to handle the NullPointerException?
Q6. WAP to handle the ArrayIndexOutOfBoundsException ?
Q7. WAP to handle the NumberFormatException?
*/


import java.util.*;

class ArithmeticExceptionDemo 
{
    public void display() 
	{
        Scanner s = new Scanner(System.in);  // Scanner object initialization
        try 
		{
            System.out.println("Enter the A and B value:");
            int a = s.nextInt();
            int b = s.nextInt();
            
            int c = a / b;  // Division operation
            System.out.println("Value of C: " + c);
        } 
		catch (java.lang.ArithmeticException ex) 
		{  
            System.out.println("Second number is zero, due to that output is infinity");
            System.out.println("Error: " + ex);
        }
    }
}

class InputMismatchExceptionDemo
 {
    public void display()
	{
        Scanner s = new Scanner(System.in);  // Scanner object initialization
        try
		{
            System.out.println("Enter the Number:");
            int no = s.nextInt();
            System.out.println("Number is: " + no);
        }
		catch (InputMismatchException ex)
		{  
            System.out.println("Error: " + ex);
        }
    }
}

class ClassNotFoundExceptionDemo 
{
    public void display() 
	{
        Scanner s = new Scanner(System.in);  // Scanner object initialization
        try 
		{
            System.out.println("Enter the class Name:");
            String str = s.nextLine();
            
            Class.forName("asdfghj");  // Incorrect class name to simulate exception
        } 
		catch (ClassNotFoundException ex)
		{  // Correct exception type
            System.out.println("Error: " + ex);
        }
    }
}

class NullPointerExceptionDemo 
{
    public void display() 
	{
        Scanner s = new Scanner(System.in);  // Scanner object initialization
        try 
		{
            int[] a = null;  // Null array reference
            System.out.println(a[0]);  // Will throw NullPointerException
        } 
		catch (NullPointerException ex) 
		{
            System.out.println("Error: " + ex);
        }
    }
}

class ArrayIndexOutOfBoundsExceptionDemo
 {
    public void display() 
	{
        Scanner s = new Scanner(System.in);  // Scanner object initialization
        try
		{
            int[] a = new int[5];      // Array of size 5
            System.out.println(a[6]);  // Trying to access index out of bounds
        } catch (ArrayIndexOutOfBoundsException ex)
		{
            System.out.println("Error: " + ex);
        }
    }
}

class NumberFormatExceptionDemo
 {
    public void display() 
	{
        Scanner s = new Scanner(System.in);  // Scanner object initialization
        try 
		{
            System.out.println("Enter the Element:");
            String str = s.nextLine();
            
            int a = Integer.parseInt(str);  // Trying to parse a non-numeric string
            System.out.println("A is: " + a);
        } 
		catch (NumberFormatException ex)
		{
            System.out.println("Error: " + ex);
        }
    }
}

public class Exception_USing_SwitchCase
 {
    public static void main(String[] args)
	{
        Scanner s = new Scanner(System.in);  // Scanner object initialization
        
        System.out.println("Menu Drive:");
        System.out.println("Case 1: ArithmeticException");
        System.out.println("Case 2: InputMismatchException");
        System.out.println("Case 3: ClassNotFoundException");
        System.out.println("Case 4: NullPointerException");
        System.out.println("Case 5: ArrayIndexOutOfBoundsException");
        System.out.println("Case 6: NumberFormatException");
        
        do 
		{  
            System.out.println("Enter the Choice:");
            int choice = s.nextInt();
            
            switch (choice)
			{
                case 1:
                    ArithmeticExceptionDemo a = new ArithmeticExceptionDemo();
                    a.display();
                    break;
                case 2:
                    InputMismatchExceptionDemo i = new InputMismatchExceptionDemo();
                    i.display();
                    break;
                case 3:
                    ClassNotFoundExceptionDemo c = new ClassNotFoundExceptionDemo();
                    c.display();
                    break;
                case 4:
                    NullPointerExceptionDemo n = new NullPointerExceptionDemo();
                    n.display();
                    break;
                case 5:
                    ArrayIndexOutOfBoundsExceptionDemo a1 = new ArrayIndexOutOfBoundsExceptionDemo();
                    a1.display();
                    break;
                case 6:
                    NumberFormatExceptionDemo n1 = new NumberFormatExceptionDemo();
                    n1.display();
                    break;
                default:
                    System.out.println("Wrong choice, please try again.");
                    break;
            }
			
		}while(true);
		
        }
    }

