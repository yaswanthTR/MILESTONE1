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
System.out.print("Enter x: ");
int x=sc.nextInt();
System.out.print("Enter y: ");
int y=sc.nextInt();
x=x*1000;
float ans=(float)x/(float)3600;
System.out.println("The length of the train is "+ans*y);
}

}
