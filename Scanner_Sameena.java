package sat_sunday_practise;

import java.util.Scanner;

public class Scanner_Sameena {

	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Please put the value of number whic you want to check ");
         int A=sc.nextInt();
         
         
         if (A>0) 
         {
        	 System.out.println("Number is positive");
         }
         else if(A<0) 
         {
        	 System.out.println("Number is negative");
         }
         else 
         {
        	 System.out.println("Numbe is zero");
         }
         
	}

}
