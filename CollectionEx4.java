import java.util.List;
import java.util.ArrayList;
class CollectionEx4{
public static void main(String args[]){
ArrayList<Integer>numbers=new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+number);
nit number1=numbers.remove(1);
System.out.println("Removed Element:"+number1);
System.out.println("List:"+numbers);
}
}