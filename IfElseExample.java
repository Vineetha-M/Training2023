import java.util.Scanner;
class IfElseExample{
public static void main(String args[]){
int n1,n2;
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
if(n2==0){
System.out.println("Division by error");
}
else
{
int result=n1/n2;
System.out.println(n1+" divided by "+n2+" is "+result);
}
}
}