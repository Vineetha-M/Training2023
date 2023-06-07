import java.util.Scanner;
class Print_Stars_Plus_Minus{
public static void Print_Multiple_Chars(int i,char c)
{
int k;
for(k=0;k<=i;k++)
{
System.out.print(c);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char c1=sc.next().charAt(0);
char c2=sc.next().charAt(0);
char c3=sc.next().charAt(0);
Print_Multiple_Chars(n,c1);
System.out.println();
Print_Multiple_Chars(n+1,c2);
System.out.println();
Print_Multiple_Chars(n+2,c3);
System.out.println();
}
}