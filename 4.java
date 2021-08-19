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
Scanner in = new Scanner(System.in);
System.out.print("Enter the number: ");
int number = in.nextInt();
int fact=1;
for(int i=1;i<=number;i++){
fact=fact*i;
}
System.out.println("The Factorial of "+number+" is: "+fact);


}
}

