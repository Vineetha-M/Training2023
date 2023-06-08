//Java program to demonstrate the use of static variable
class Student{
int rollno;//instance variable
String name;
static String college="MTIE";//static variable
//Constructor
Student(int i,String n){
rollno=i;
name=n;
}
//method to display the values
void display(){
System.out.println(rollno+" " +name+" "+college);
}
}
public class TestStaticVariable1{
public static void main(String args[]){
Student s1=new Student(111,"Vinni");
Student s2=new Student(222,"Usha");
Student.college="NRI";
s1.display();
s2.display();
}
}
