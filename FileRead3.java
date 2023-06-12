import java.io.*;
class FileRead3{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\Demo\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countvowel=0;
while((i=br.read())!=-1){
if(((char)i!='a')||((char)i!='e')||((char)i!='i')||((char)i!='o')||((char)i!='u')||((char)i!='A')||((char)i!='E')||((char)i!='I')||((char)i!='O')||((char)i!='U'))
countvowel++;}
System.out.println(countvowel);
br.close();
fr.close();
}
}