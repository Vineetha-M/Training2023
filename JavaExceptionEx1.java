public class JavaExceptionEx1{
public static void main(String args[]){
try{
//code that raise an exception
int data=100/0;
int n=23;
}
catch(Exception e){
System.out.println(e);}
System.out.println("Rest of the code...");
}
}