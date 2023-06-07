import java.util.Scanner;
 public class Pattern4{
public static void PrintPattern(char c,int k)
{
for(int i=1;i<=k;i++)
{
PrintLine(c,i);
}
}
public static void ReversePattern(char c,int k)
{
for(int i=k;i>=1;i--)
{
PrintLine(c,i);
}
}
public static void PrintLine(char c,int k)
{
System.out.println();
for(int i=1;i<=k;i++)
{
System.out.print(c+" ");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char ch=sc.next().charAt(0);
int x,y;
if(n%2==0)x=y=n/2;
else{x=n/2;y=n/2+1;}
PrintPattern(ch,x);
ReversePattern(ch,y);
}
}