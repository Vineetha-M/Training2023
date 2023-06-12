import java.util.Scanner;
class UpperDiamond2{
public static void PrintPattern(int n,char ch){ 
int i,j;
for(i=n/2,j=1;i<=n/2&&j<=n;i--,j+=2){
PrintLine('#',i,ch,j);
System.out.println();
}}
public static void PrintLine(char c1,int n,char ch,int m){
for(int i=0;i<n;i++)System.out.print(c1);
for(int i=1;i<=m;i++)System.out.print(ch);
for(int i=0;i<n;i++)System.out.print(c1);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char c=sc.next().charAt(0);
PrintPattern(n,c);
}
}