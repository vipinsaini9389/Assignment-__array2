//Write a Java program to check if an array of integers is without 0 and -1.
public class NoZeroOrMinusOne {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 0, 3, -1, 5};

        System.out.println("Array nums1 does not contain 0 or -1: " + checkNoZeroOrMinusOne(nums1));
        System.out.println("Array nums2 does not contain 0 or -1: " + checkNoZeroOrMinusOne(nums2));
    }

    public static boolean checkNoZeroOrMinusOne(int[] nums) {
        for (int num : nums) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }
}
