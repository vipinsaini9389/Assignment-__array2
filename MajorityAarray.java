//38. Write a Java program to get the majority element from an array of integers containing duplicates.  

//Majority element: A majority element is an element that appears more than n/2 times where n is the array size.

public class MajorityAarray{
public static void main(String[] args) {
	        int arr[] = { 9, 4, 3, 9, 9, 4, 9, 9, 8 };
	        int n = arr.length;
	        int maxCount = 0;
	        int index = -1;
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if (arr[i] == arr[j])
	                    count++;
	            }
	            if (count > maxCount) {
	                maxCount = count;
	                index = i;
	            }
	        }
	        if (maxCount > n / 2)
	            System.out.println("Mojority_array : "+arr[index]);
	        else
	            System.out.println("No Majority Element Found");
	    }
}

