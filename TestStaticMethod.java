//We make the main method static bcz to call the method without creating any object of the class
class Student{
int rollno;
String name;
static String college="MTIE";
//static method to change the value of static variable
static void change(){
college="NRI";
}
//constructor to intialize the variables
Student(int i,String n){
rollno=i;
name=n;
}
//method to display values
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
//test class to create and display the values of object
public class TestStaticMethod{
public static void main(String args[])
{
Student.change();//calling change method
//creating objects
Student s1=new Student(111,"Vinni");
Student s2=new Student(112,"USha");
Student s3=new Student(113,"Keerthi");
//calling display methods
s1.display();
s2.display();
s3.display();
}
}