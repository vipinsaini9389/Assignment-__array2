//Write a Java program to find the second largest element in an array.
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15};

        int largest = array[0];
        int secondLargest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest != largest) {
            System.out.println("Second largest element in the array: " + secondLargest);
        } else {
            System.out.println("There is no second largest element in the array");
        }
    }
}
