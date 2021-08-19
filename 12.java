/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");  
	   int number=sc.nextInt();
	   int flag=0;
	   for(int i=1;i<=number;i++)
	   {
	       if(number%i==0)
	       {
	           flag+=1;
	       }
	   }
	   if(flag==2)
	   {
	       System.out.print("The given number is prime number");
	   }
	   else{
	       System.out.print("The given number is not prime number");
	   }

	
}
}
