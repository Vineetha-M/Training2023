//Example of this keyword:to differentiate between instance variable and local variable
class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,Float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);}
}
class TestThis{
public static void main(String args[]) 
{
Student s1=new Student(111,"Vinni",50000f);
Student s2=new Student(112,"Usha",100000f);
s1.display();
s2.display();
}
}