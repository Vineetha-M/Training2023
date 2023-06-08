class Author{
String authorName;
int age;
String place;
//author class constructor
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book{
String name;
int price;
Author auther;//author details
Book(String n,int p,Author auther){
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[])
{
Author auther=new Author("Vinni",20,"India");
Book b=new Book("Java for beginner",800,auther);
System.out.println("Book Name:"+b.name);
System.out.println("Book Price:"+b.price);
System.out.println("--------Auther Details--------");
System.out.println("Auther Name:"+b.auther.authorName);
System.out.println("Auther age:"+auther.age);
System.out.println("Auther Place:"+auther.place);
}
}


