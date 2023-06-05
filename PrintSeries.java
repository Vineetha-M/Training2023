import java.util.Scanner;
class PrintSeries{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int i=0;
while(i<=n)
{
System.out.print(i);
i++;
if(i<=n)
{
System.out.print(",");
}
}
}
}