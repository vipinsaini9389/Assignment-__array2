//Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

public class SumOfTens {
    public static void main(String[] args) {
        int[] nums1 = {10, 10, 2, 10, 4, 6};
        int[] nums2 = {10, 10, 2, 10, 4, 5};
        
        System.out.println("Sum of 10 in nums1 is 30: " + checkSumOfTens(nums1));
        System.out.println("Sum of 10 in nums2 is 30: " + checkSumOfTens(nums2));
    }

    public static boolean checkSumOfTens(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 10) {
                sum += num;
            }
        }
        return sum == 30;
    }
}
