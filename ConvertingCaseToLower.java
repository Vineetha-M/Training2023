//Converting the case of a string without using built in methods
import java.util.Scanner;
class ConvertingCaseToLower{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1="";
int ascii;
int len=s.length()-1;
for(int i=len;i>=0;i--)
{
if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
{
ascii=s.charAt(i);
ascii=ascii+32;
s1=s1+(char)ascii;
}
else{
s1=s1+s.charAt(i);
}
}
System.out.println("s1:"+s1);
s=s1;
String rs="";
for(int i=len;i>=0;i--){
rs=rs+s.charAt(i);
}
if(s.equals(rs)){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}
