//Initializing object through constructor
class Student{
int rollno;
String name;
Student(){//Default constructor
rollno=0;
name=null;
}
Student(int r,String n){//Parametrised constructor
rollno=r;
name=n;
}
void displayInformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent5{
public static void main(String args[]){
Student s1;//another method to create object 
s1=new Student();
Student s2=new Student(111,"Vinni");
s1.displayInformation();
s2.displayInformation();
}
}
