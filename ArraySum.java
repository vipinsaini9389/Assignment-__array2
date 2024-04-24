 //Write a Java program to sum values of an array
public class ArraySum {
    public static void main(String[] args) {
     int [] arr = {21,16,27,34,32};
     int sum=0;
     for (int i=0;i<arr.length;i++){
	    sum=sum+arr[i];
        System.out.println("sum of Array"+sum);
      }
    }
}
