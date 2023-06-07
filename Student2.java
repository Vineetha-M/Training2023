//java program to initialize the values from one object to another object
class Student2{
int id;
String name;
//constructor to initialize ineteger and string
Student2(int i,String n){
id=i;
name=n;
}
//constructor to initialize another object
Student2(Student2 s){
id=s.id;
name=s.name;
}
void Display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student2 s1=new Student2(111,"Vinni");
Student2 s2=new Student2(222,"Usha");
s1.Display();
s2.Display();
}
}
