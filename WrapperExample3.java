//Java Program to convert all primitives into its corresponding
//wrapper objects and vice-versa
public class WrapperExample3{
public static void main(String args[]){
byte b=10;
short s=20;
int i=30;
long l=40;
float f=50.0F;
double d=60.0D;
char c='a';
boolean b2=true;
//Autoboxing;Converting primitives into objects
Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Float floatobj=f;
Double doubleobj=d;
Character charobj=c;
Boolean booleanobj=b2;
//Printing objects
System.out.println("---Printing object values---");
System.out.println("Byte object:"+byteobj);
System.out.println("Short object:"+shortobj);
System.out.println("Integer object:"+intobj);
System.out.println("Long object:"+longobj);
System.out.println("Float object:"+floatobj);
System.out.println("Double object:"+doubleobj);
System.out.println("Character object:"+charobj);
System.out.println("Boolean object:"+booleanobj);
//Unboxing :Converting Objects to Primitives
byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean booleanvalue=booleanobj;
//Printing Primitives
System.out.println("---Printing Primitive Values---");
System.out.println("bytevalue:"+bytevalue);
System.out.println("shortvalue:"+shortvalue);
System.out.println("intvalue:"+intvalue);
System.out.println("longvalue:"+longvalue);
System.out.println("floatvalue:"+floatvalue);
System.out.println("doublevalue:"+doublevalue);
System.out.println("charvalue:"+charvalue);
System.out.println("booleanvalue:"+booleanvalue);
}
}



