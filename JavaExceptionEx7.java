public class JavaExceptionEx7{
public static void main(String args[]){
try{
int data1=30/0;//may throw exception
}
//handling the exception
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
System.out.println("Rest of the code...");
}
}