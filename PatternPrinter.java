import java.util.Scanner;
public class PatternPrinter{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n-4;j++){
System.out.print("#");}
for(int k=1;k<=i;k++){
System.out.print("*");}
for(int v=1;v<=n-4;v++){
System.out.print("#");}
System.out.println();
}}
}

