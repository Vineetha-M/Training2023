public class JavaExceptionEx8{
public static void main(String args[]){
try{
int a[]={1,2,3};
System.out.println(a[10]);//may throw exception
}
//handling the exception
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
System.out.println("Rest of the code...");
}
}