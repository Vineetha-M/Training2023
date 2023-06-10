//Java program to check if a given string is a valid integer
import java.io.*;
import java.util.*;
class StringRNot{
static boolean isNumber(String s){
for(int i=0;i<s.length()-1;i++){
if(Character.isDigit(s.charAt(i))==true)
{
return true;}
}
return false;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
if(isNumber(str)){
System.out.println("Integer");
}
else{
System.out.println("String");
}
}
}