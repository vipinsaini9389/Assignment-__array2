//39. Write a Java program to print all the LEADERS in the array.  
//Note: An element is leader if it is greater than all the elements to its right side.


public class Leader_In_array {
	    public static void main(String[] args) {
	        int[] arr = {16, 30, 4, 23, 5, 7};
	        int n = arr.length;

	        System.out.println("Leaders in the array:");

	        for (int i = 0; i < n; i++) {
	            boolean isLeader = true;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] <= arr[j]) {
	                    isLeader = false;
	                    break;
	                }
	            }
	            if (isLeader) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	}
