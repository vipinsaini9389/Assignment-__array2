 //Write a Java program to calculate the average value of array elements.
public class ArrayAverage {
	public static void main(String []args){
     int [] arr = {21,16,27,34,32};
     int sum=0;
      for (int i=0;i<arr.length;i++){
	   sum=sum+arr[i];
       int avg=sum/arr.length;
        System.out.println("Average or Array"+avg);
      }
    }
} 