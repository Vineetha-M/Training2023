final class Bike{
}
class Honda1 extends Bike{
void run(){
System.out.println("Running safely with 100kmph");//error:cannot inherit from final block
}
public static void main(String args[])
{
Honda1 h=new Honda1();
h.run();
}
}