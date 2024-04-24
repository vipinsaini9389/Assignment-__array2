//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements


public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZerosToEnd(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[n++] = nums[i];
            }
        }
        for (int i = n; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
