import java.util.Scanner;
class PatternPrinter{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=n-i;j>0;j--)
System.out.print("#");
for(int k=1;k<=i;k++)System.out.print(c);
System.out.println();}
}}

