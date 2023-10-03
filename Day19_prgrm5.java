import java.util.Scanner;
public class Day19_prgrm5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a>1000)&&(a<9999)&&(b>1000)&&(b<9999)&&(c>1000)&&(c<9999)){
int larger1=findLarger1(b);
int smaller=findSmaller(a);
int larger2=findLarger2(c);
int result=(larger1*smaller*larger2)+c;
System.out.println(result);
}
else{
System.out.println("Enter valid numbers");}}
public static int findLarger1(int b){
int larger1=0;
String s2=String.valueOf(b);
for(int k=0;k<s2.length();k++){
char ch=s2.charAt(k);
int digit1=Character.getNumericValue(ch);
if(digit1>larger1){
larger1=digit1;
}}
return larger1;}
public static int findSmaller(int a){
int smaller=9;
String s1=String.valueOf(a);
for(int i=0;i<s1.length();i++){
char ch1=s1.charAt(i);
int digit2=Character.getNumericValue(ch1);
if(digit2<smaller){
smaller=digit2;
}}
return smaller ;
}
public static int findLarger2(int c){
int larger2=0;
String s3=String.valueOf(c);
for(int j=0;j<s3.length();j++){
char ch2=s3.charAt(j);
int digit3=Character.getNumericValue(ch2);
if(digit3>larger2){
larger2=digit3;
}}
return larger2;}
}