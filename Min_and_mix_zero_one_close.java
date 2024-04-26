//40. Write a Java program to find the two elements in a given array of positive and negative numbers such that their sum is close to zero.


public class Min_and_mix_zero_one_close {
	    public static void main(String[] args) {
	    	        int[] arr = { 5, -4, 7, 8, -6};
	    	        int size = arr.length;
	    	        if (size < 2) {
	    	            System.out.println("Invalid Input");
	    	            return;
	    	        }
	    	        int minLNum = 0, minRNum = 1, minSum = arr[0] + arr[1];
	    	        for (int l = 0; l < size - 1; l++) {
	    	            for (int r = l + 1; r < size; r++) {
	    	                int sum = arr[l] + arr[r];
	    	                if (Math.abs(minSum) > Math.abs(sum)) {
	    	                    minSum = sum;
	    	                    minLNum = l;
	    	                    minRNum = r;
	    	                }
	    	            }
	    	        }
	    	        System.out.println("Two elements with the minimum sum: " +
	    	                arr[minLNum] + " and " + arr[minRNum]);
	    	    }

	        
	    }

