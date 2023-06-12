import java.util.Scanner;
class NumberPattern4{
static int x=0;
public static void PrintPattern(int n){
for(int i=0;x<=n;i++){
PrintLine(i);
System.out.println();
}}
public static void PrintLine(int n){
for(int i=0;i<=n;i++){
System.out.print(x++);
if(i<n)System.out.print(",");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
PrintPattern(n);
}
}
