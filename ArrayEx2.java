class ArrayEx2{
public static void main(String args[]){
//create an array
int[] numbers={20,29,21,30};
int sum=0;
Double average;
//access all elements using for each loop and each element in sum
System.out.println("Using for-each loop");
for(int number:numbers){
sum=sum+number;
}
//get the total number of elements
int arraylength=numbers.length;
//Calculate the average
//convert the average from int to double
average=((double)sum/(double)arraylength);
System.out.println("Sum:"+sum);
System.out.println("Average:"+average);
}
}