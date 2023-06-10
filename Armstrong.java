import java.util.Scanner;
class Armstrong{
public static int lenDigit(int n){
int len=0;
while(n>0){
len++;
n=n/10;
}
return len;
}
public static boolean checkArmstrong(int n){
double sum=0;
int x;
int exp=lenDigit(n);
while(n>0){
 x=n%10;
sum=sum+Math.pow(x,exp);
n=n/10;
}
return n==sum;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(checkArmstrong(num)){
System.out.println("YES");
}
else
System.out.println("NO");
}
}
