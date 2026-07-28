class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int MaxSum = 0;
        int maximum = nums[0];

        int MinSum = 0;
        int minimum = nums[0];

        int total = 0;

        for(int i = 0 ; i < n ; i++){

            MaxSum += nums[i];
            maximum = Math.max(maximum, MaxSum);
            if(MaxSum < 0) MaxSum = 0;

            MinSum += nums[i];
            minimum = Math.min(minimum, MinSum);
            if(MinSum > 0) MinSum = 0;

            total += nums[i];
        }
        if(maximum < 0) return maximum;

        return Math.max(maximum, total - minimum);
    }
}