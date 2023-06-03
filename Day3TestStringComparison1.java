class Day3TestStringComparison1{
public static void main(String args[]){
String s1="Virat";
String s2="Virat";
String s3=new String("Virat");
String s4="Saurav";
System.out.println(s1.equals(s2));//true
System.out.println(s1.equals(s4));//true
System.out.println(s1.equals(s4));//false
}
}
