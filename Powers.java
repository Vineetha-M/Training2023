//finding
import java.util.Scanner;
class Powers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1,n2;
n1=sc.nextInt();
n2=sc.nextInt();
int i=1,result=1;
while(i<=n2)
{
result=result*n1;
i++;
}
System.out.print(result);
}
}