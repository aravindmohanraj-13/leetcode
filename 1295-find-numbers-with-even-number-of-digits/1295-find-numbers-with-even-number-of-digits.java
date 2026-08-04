class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int cnt = 0;
            while(nums[i] != 0){
                int digit = nums[i] % 10;
                cnt++;
                nums[i] /= 10;
            }
            if(cnt % 2 == 0){
                count++;
            }
            // cnt = 0;
        }
        return count;
    }
}