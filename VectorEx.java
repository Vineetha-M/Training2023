import java.util.Vector;
class VectorEx{
public static void main(String aegs[]){
Vector<String> mammals=new Vector<>();
mammals.add("DOG");
mammals.add("CAT");
mammals.add("COW");
System.out.println("Vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("CROCODILE");
//Using addAll()
animals.addAll(mammals);
System.out.println("New Vector:"+animals);}}