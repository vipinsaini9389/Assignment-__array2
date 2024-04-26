//47. Write a Java program to find the rotation count in a given rotated sorted array of integers.
public class RotationCount {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int[] array2 = {1, 2, 3, 4};

        System.out.println("Rotation count of array1: " + findRotationCount(array1));
        System.out.println("Rotation count of array2: " + findRotationCount(array2));
    }

    public static int findRotationCount(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            if (array[left] <= array[right]) {
                return left; // No rotation
            }

            int mid = left + (right - left) / 2;
            int next = (mid + 1) % array.length;
            int prev = (mid + array.length - 1) % array.length;

            if (array[mid] <= array[next] && array[mid] <= array[prev]) {
                return mid;
            } else if (array[mid] <= array[right]) {
                right = mid - 1;
            } else if (array[mid] >= array[left]) {
                left = mid + 1;
            }
        }

        return -1; // Array is not rotated
    }
}
