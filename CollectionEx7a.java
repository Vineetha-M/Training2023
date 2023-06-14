import java.util.ArrayList;
class CollectionEx7a{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("CAT");
animals.add("DOG");
animals.add("COW");
System.out.println("ArrayList:"+animals);
animals.set(2,"HORSE");
System.out.println("Modified ArrayList:"+animals);}}