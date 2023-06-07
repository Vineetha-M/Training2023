import java.util.Scanner;
class PalindromeString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String rs="";
int len=s.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+s.charAt(i);
}
s=s.toLowerCase();
rs=rs.toLowerCase();
System.out.println(rs);
if(s.equals(rs))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}