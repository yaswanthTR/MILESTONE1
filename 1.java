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
int n=25, max;
Scanner s = new Scanner(System.in);
int arr[] = new int[n];
System.out.println("Enter the elements in the array:");
for(int i = 0; i < n; i++)
{
arr[i] = s.nextInt();
}
max = arr[0];
for(int i = 0; i < n; i++)
{
if(max < arr[i])
{
max = arr[i];
}
}
System.out.println("Maximum number in the set is:"+max);
}
}

