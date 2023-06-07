import java.util.Scanner;
public class Pattern2{
public static void PrintLine(char c,int k)
{
System.out.println();
for(int j=1;j<=k;j++)
System.out.print(c+" ");
}
public static void PrintPattern(char c,int n){
for(int i=1;i<=n;i++)
{
PrintLine(c,i);
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
