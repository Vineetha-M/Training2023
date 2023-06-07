import java.util.Scanner;
class ExtractDigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int len=s.length()-1;
for(int i=0;i<=len;i++)
{
if((s.charAt(i)>='0')&&(s.charAt(i)<='9'))
{
System.out.print(s.charAt(i));
}
}
}
}