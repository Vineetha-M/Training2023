class Bike{
final void run(){
System.out.println("Running");
}
}
class Honda extends Bike{
void run(){
System.out.println("Running safely with 100kmph");//error:run() in honda cannot over ride run() in bike
}
public static void main(String args[])
{
Honda h=new Honda();
h.run();
}
}