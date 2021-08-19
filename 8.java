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

float ans=(float)x/(float)y;
float result=ans*(float)18/(float)5;
float res=result+5;

System.out.println("The speed of the train is "+res);
}

}
