class ThreadPriority{
public static void main(String args[])throws Exception{
Thread t=Thread.currentThread();
System.out.println("CURRENTTHREAD="+t);
t.setName("New Thread by Usha");
t.setPriority(t.getPriority()-1);
System.out.println("CURRENTTHREAD="+t);
System.out.println("NAME="+t.getName());
}
}