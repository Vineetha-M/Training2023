import java.util.Scanner;
class Sample{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int i;
for(i=n;i>=0;i=i-m){
System.out.print(i);
if(i>0){
System.out.print(",");
}
}
}
}
