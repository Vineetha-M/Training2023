//example of LinkedList
import java.util.List;
import java.util.LinkedList;
class CollectionEx5{
public static void main(String args[]){
LinkedList<Integer> numbers=new LinkedList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int number1=numbers.get(2);
System.out.println("Accessed Element:"+number1);
int number2=numbers.indexOf(3);
System.out.println("Position of 3:"+number2);
int number3=numbers.remove(1);
System.out.println("Removed Element:"+number3);
}}
