//30. Write a Java program to check if an array of integers is without 0 and -1.
public class ArrayCheck1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, 2, -1, 4, 5};

        System.out.println("Array 1: " + checkArray(array1));
        System.out.println("Array 2: " + checkArray(array2));
    }

    public static boolean checkArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || array[i] == -1) {
                return false;
            }
        }
        return true;
    }
}

