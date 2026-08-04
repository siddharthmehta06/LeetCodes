class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (low <= high) {

            // If the current search space is already sorted,
            // the first element is the minimum in this range.
            if (nums[low] <= nums[high]) {
                min = Math.min(min, nums[low]);
                break;
            }

            int mid = low + (high - low) / 2;

            if (nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }

        return min;
    }
}