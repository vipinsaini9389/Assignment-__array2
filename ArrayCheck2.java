//Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.
public class ArrayCheck2 {
    public static void main(String[] args) {
        int[] array1 = {10, 10, 2, 10, 10};
        int[] array2 = {10, 10, 2, 10, 5};

        System.out.println("Array 1: " + checkArray(array1));
        System.out.println("Array 2: " + checkArray(array2));
    }

    public static boolean checkArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num == 10) {
                sum += num;
            }
        }
        return sum == 30;
    }
}
