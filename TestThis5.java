//using this keyword adding another data type
class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,String name,String course,float fee){
this.rollno=rollno;
this.name=name;
this.course=course;

this.fee=fee;
}
void display(){
System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis5{
public static void main(String args[])
{
Student s1=new Student(111,"Vinni","Java");
Student s2=new Student(112,"Usha","c",6000f);
s1.display();
s2.display();
}
}
