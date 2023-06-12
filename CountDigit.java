import java.io.*;
class CountDigit{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\Demo\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countvowel=0;
while((i=br.read())!=-1){
if(((char)i>='0')&&((char)i<='9'))
countvowel++;}
System.out.println(countvowel);
br.close();
fr.close();
}
}