class Rectangle{
int length;
int width;
void insert(int l,int w){
length=l;
width=w;
}
void calculateArea1(){
System.out.println(length*width);
}
}
class TestRectangle2{
public static void main(String args[]){
Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects
r1.insert(14,10);
r2.insert(3,30);
r1.calculateArea1();
r2.calculateArea1();
}
}
