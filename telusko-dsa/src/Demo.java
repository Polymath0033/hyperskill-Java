public class Demo {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 9, 11, 13 };
        int target = 11;
        int searchLinear = linearSearch(nums, target);
        int searchBinary = binarySearch(nums, target);
        int searchRecursiveBinary = recursiveBinarySearch(nums, target, 0, nums.length - 1);
        System.out.println("Linear Search: " + searchLinear);
        System.out.println("Binary Search: " + searchBinary);
        System.out.println("Recursive Binary Search: " + searchRecursiveBinary);
    }

    public static int linearSearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] nums, int target, int left, int right) {
        if (nums.length == 0) {
            return -1;
        }
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return recursiveBinarySearch(nums, target, mid + 1, right);
        } else {
            return recursiveBinarySearch(nums, target, left, mid - 1);
        }
    }
}