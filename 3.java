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
Scanner sc = new Scanner(System.in);
System.out.print("Enter the level of pyramid : ");
int n=sc.nextInt();
System.out.println("The pyramid is - ");
int d=1,s=n-1,num=1;
while(d<=n){
for(int i=1;i<=s;i++)
System.out.print(" ");
for(int i=1;i<=d;i++){
if(num>9){
num=num%9-1;
}
System.out.print(num);num++;
}
int rev=num-2;
for(int i=1;i<d;i++){
if(rev<0){
rev=9;
}
System.out.print(rev);
rev--;
}
d++;
System.out.print("\n");
s--;
}

}
}


