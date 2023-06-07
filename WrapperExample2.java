//Java program to convert object into primitive
//Autoboxing example of Integer to int
public class WrapperExample2{
public static void main(String args[]){
//Converting Integer into int
Integer a=new Integer(3);
int i=a.intValue();//converting Integer into int explicitly
int j=a;//autoboxing,now compiler will write a.intvalueOf() internally
System.out.println(a+" "+i+" "+j);
}
}