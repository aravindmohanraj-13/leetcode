class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];
        if (n == 2) return Math.min(nums[0], nums[1]);

        int low = 0;
        int high = n - 1;

        if (nums[low] < nums[high]) return nums[low];

        while (low < high) {
            int mid = low + ((high - low) >> 1);

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}