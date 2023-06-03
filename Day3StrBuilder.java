class Day3StrBuilder
{
public static void main(String args[])
{
StringBuilder s1=new StringBuilder("Hi");//String 1
StringBuilder s2=new StringBuilder("Hello");//String 2
StringBuilder s=s1.append(s2);//String 3 to store the result
System.out.println(s.toString());//Displays result
}
}