/*
Q1. WAP to handle the exception by using throws clause?
*/


import java.io.IOException;

public class Generate_IOExceptionWith_Throws 
{

    
    public static void generateIOException() throws IOException 
	{
        
        throw new IOException("Simulated IOException using throws");
    }

    public static void main(String[] args) 
	{
        try 
		{
          generateIOException();
        } 
		catch (IOException e) 
		{
          System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}

   