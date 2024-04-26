//42. Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.

public class Sorting_left_0_1_print_array {

	public static void main(String[] args) {
	  int[] arr = {1,0,1,0,0,1,0,1};
	  int n =arr.length;
	  for(int i=0;i<n;i++) {
	  for(int j=0;j<n-1;j++) {
		  if(arr[j]>arr[j+1]) {
			  int temp  =arr[j];
			  arr[j] =arr[j+1];
			  arr[j+1] =temp;  
		  }
	  }
	  }
	  for(int i=0;i<n;i++) {
		  System.out.print(arr[i]+" ");
	  }

	}

}
