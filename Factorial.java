import java.util.Scanner;
class Factorial{
public static int calculateFact(int n){
if(n==0)
return 1;
else return n*calculateFact(n-1);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num<0)
System.out.println("INVALID");
else 
System.out.println(calculateFact(num));
}
}