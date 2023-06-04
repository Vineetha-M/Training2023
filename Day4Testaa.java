import java.util.Scanner;
class Day4Testaa{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=sc.nextInt();
String str="";
for(int i=0;i<=num;i=i+num1)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
System.out.print(str.charAt(i));
}
}
