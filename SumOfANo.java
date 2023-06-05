import java.util.Scanner;
class SumOfANo{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0,x;
n=sc.nextInt();
while(n>0)
{
x=n%10;
sum=sum+x;
n=n/10;
}
System.out.println(sum);
}
}

