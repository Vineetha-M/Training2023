class FinalEx1{
final int speedlimit=900;//final variable
void run()
{
speedlimit=400;
System.out.println(speedlimit);//error:cannot assign a value to final variable speedlimit
}
public static void main(String args[]){
FinalEx1 f=new FinalEx1();
f.run();
}
}