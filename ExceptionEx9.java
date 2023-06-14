import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class ExceptionEx9{
public static void main(String args[]){
PrintWriter pw;
try{
pw=new PrintWriter("vrg.txt");//may throw exception
pw.println("Saved");
}
//providing the checked exception handler
catch(FileNotFoundException e){
System.out.println(e);
}
System.out.println("File Saved Succcessfully");
}
}