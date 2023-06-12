import java.util.Scanner;
class NumberPAttern2{
public static void PrintLine(int n){
for(int i=n;i>=1;i--){
System.out.print(i);}
}
public static void Pattern(int n){
for(int i=n;i>=1;i--){
System.out.println();
PrintLine(i);}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Pattern(n);
}
}