//example for:-this keyword can be used to call current class methods
class A{
void m(){
System.out.println("Hello m");
}
void n(){
System.out.println("Hello n");
this.m();//m()//same as this.m(); 
}
}
class TestThis2{
public static void main(String args[])
{
A a=new A();
a.n();
}
}