public class MultipleCatchBlock1{
public static void main(String args[]){
int a[]=new int[5];
a[0]=30;
a[1]=31;
a[2]=0;
a[3]=33;
try{
for(int i=0;i<=5;i++)System.out.println(100/a[i]);}
catch(ArithmeticException e){
System.out.println("Arithmetic Exception occurs");}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundsException occurs");}
catch(Exception e){
System.out.println("Parent Exception occurs");
}
System.out.println("Rest of the code...");
}
}