import java.util.Arrays;

public class ArraySort{

    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {5, 2, 8, 1, 6};
        System.out.println("Original numeric array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));

        // String array
        String[] strings = {"banana", "apple", "orange", "pear"};
        System.out.println(" string array: " + Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println("Sorted string array: " + Arrays.toString(strings));
    }
}
