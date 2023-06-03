class Day3Teststringcomparison3{
public static void main(String args[]){
String s1="Vineetha";
String s2="Vineetha";
String s3=new String("Vineetha");
System.out.println(s1==s2);//true bcz both refer to same instance
System.out.println(s1==s3);//false bcz s3 refers to instance created in nonpool
}
}
