//printing factorial of a number using while loop
import java.util.Scanner;
class Factorial{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int i=1,fact=1;
while(i<=n){
fact=fact*i;
i++;
}
System.out.print(fact);
}
}