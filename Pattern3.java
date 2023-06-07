import java.util.Scanner;
public class Pattern3{
public static void PrintLine(char c,int k)
{
System.out.println();
for(int j=k;j>=1;j--)
System.out.print(c+" ");
}
public static void PrintPattern(char c,int n){
for(int i=n;i>=1;i--)
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