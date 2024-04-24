//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.


public class FindPairsWithSum {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 5, 7, 8, 9};
        int targetSum = 7;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    System.out.println("Pair found: " + array[i] + ", " + array[j]);
                }
            }
        }
    }
}
