 //Write a Java program to find the second smallest element in an array.

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15};

        int smallest;
        int secondSmallest;

        if (array[0] < array[1]) {
            smallest = array[0];
            secondSmallest = array[1];
        } else {
            smallest = array[1];
            secondSmallest = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        System.out.println("Second smallest element in the array: " + secondSmallest);
    }
}
