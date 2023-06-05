import java.util.Scanner;
class ReverseAString{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n,rs="";
System.out.println("Enter a String");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
System.out.println(rs);
}
}
