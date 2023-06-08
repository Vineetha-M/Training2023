class Bike1{
final int speedlimit;//blank final variable
Bike1(){
speedlimit=90;
System.out.println(speedlimit);//final variable can be initialized but onlt once
}
public static void main(String args[])
{
new Bike1();
}
}