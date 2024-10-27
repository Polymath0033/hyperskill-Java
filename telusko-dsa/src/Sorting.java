public class Sorting {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 5, 11 };
        int target = 10;
        int[] searchLinear = twoSum(nums, target);
        System.out.println("Linear Search: " + searchLinear);

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};

    }
}
