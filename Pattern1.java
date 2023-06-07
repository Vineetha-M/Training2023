import java.util.Scanner;
public class Pattern1{
public static void PrintPattern(char c,int k)
{
for(int i=0;i<k;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(c+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char ch=sc.next().charAt(0);
PrintPattern(ch,n);
}
}
