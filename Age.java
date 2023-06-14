//user defined exception in java

import java.util.*;
//custom exception to validate age with defined age limit
class AgeDoesNotFitException extends Exception{
//member variable to store our custom message 
String msg;
AgeDoesNotFitException(String msg){
//passing the parameter to the super class constructor
super(msg);
this.msg=msg;
}
//overriding with our custom message
@Override
public String toString(){
return msg;}
}
class Age{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try{
if(age<18){
throw new AgeDoesNotFitException("Entered age doesn't fulfill the required age limit");
}}
catch(AgeDoesNotFitException ex){
//calls override toString() method
System.out.println(ex);
//prints the meassage passed to the super constructor
System.out.println(ex.getMessage());
}
}
}