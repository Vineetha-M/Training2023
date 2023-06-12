class Thread1 implements Runnable{
public static void main(String args[]){
Thread1 obj=new Thread1();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("Threads inside main are very much helpful in java");
}
public void run(){
System.out.println("Threads from overridden run methid are very helpful");
}
}