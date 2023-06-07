import java.util.Scanner;
class FindingAsciiValue{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int asciivalue=(int)(ch);
System.out.print(asciivalue);
}
}
