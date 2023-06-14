import java.util.ArrayList;
class CollectionEx7b{
public static void main(String args[]){
ArrayList<String> animals=new ArrayList<>();
animals.add("COW");
animals.add("CAT");
animals.add("DOG");
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual elements:");
//iterate using for-each loop
for(String temp:animals){
System.out.print(temp);
System.out.print(",");}
}}
