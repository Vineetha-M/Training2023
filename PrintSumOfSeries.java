//printing the sume of numbers using while loop
import java.util.Scanner;
class PrintSumOfSeries{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int i=0,sum=0;
while(i<=n){
sum=sum+i;
i++;
}
System.out.print(sum);
}
}