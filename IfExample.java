import java.util.Scanner;
class IfExample
{
public static void main(String args[]){
int i,j,max;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
if(i>j){
max=i;
}
else{
max=j;}
System.out.println("Maximum value is:"+max);
}
}
