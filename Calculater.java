//Java Program to get the cube of a given number using the static method
class Calculater{
static int cube(int x){
return x*x*x;
}
public static void main(String args[])
{
int result=Calculater.cube(5);
System.out.println(result);
}
}