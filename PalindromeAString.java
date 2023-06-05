import java.util.Scanner;
class PalindromeAString{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n,rs="";
String temp;
System.out.println("Enter a String");
n=sc.next();
int len=n.length()-1;
temp=n;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
if(temp==rs)
{
System.out.println("yes");
}
else
{
System.out.println(rs);
}
}
}