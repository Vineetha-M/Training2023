//inner block variable cannont be accessed throughout the class the variable which is defined in outer block can be accessed
class ScopeOfVariable{
public static void main(String args[])
{
int i;
i=100;
System.out.println("Value of i here is:"+i);
{
int j;
j=55;
i=i*j;
System.out.println(i);
System.out.println(j);
}
System.out.println(i);
}
}