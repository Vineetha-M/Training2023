//Example of Hybrid Inheritance
class C{
public void display()
{
System.out.println("Method of class C");
}
}
class A extends C{
public void display(){
System.out.println("Method of class A");
}
}
class B extends C{
public void display()
{
System.out.println("Method of class B");
}
}
class D extends A{
public void display(){
System.out.println("Method of class D");
}
public static void main(String args[])
{
D d=new D();
d.display();
}
}