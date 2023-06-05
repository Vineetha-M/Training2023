import java.util.Scanner;
class ReverseANo{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,rev=0,x;
n=sc.nextInt();
while(n>0)
{
x=n%10;
rev=rev*10+x;
n=n/10;
}
System.out.println(rev);
}
}
