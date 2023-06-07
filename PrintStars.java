import java.util.Scanner;
class PrintStars{
public static void Print_Multiple_Stars(int i)
{
int k;
for(k=1;k<=i;k=k+1){
System.out.print("*");}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Print_Multiple_Stars(n);
System.out.println(" ");
}
}