public class JavaExceptionEx5{
public static void main(String args[]){
int i=30;
int j=0;
int data;
try{
//code that raise an exception
data=i/j;
}
catch(Exception e){
//resolving the exception in catch block
System.out.println(i/(j+2));}
}
}