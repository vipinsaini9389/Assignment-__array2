/* Write a Java program to find all the distinct triplets such that the sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
Sample array: [1, -2, 0, 5, -1, -4]
Target value: 2. */
public class ThreeSum {
    public static void main(String[] args) {
        int[] array = {1, -2, 0, 5, -1, -4};
        int target = 2;
        findTriplets(array, target);
    }

    public static void findTriplets(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1, high = nums.length - 1, sum = target - nums[i];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        System.out.println(nums[i] + " " + nums[low] + " " + nums[high]);
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
    }
}
