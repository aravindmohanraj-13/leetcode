class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        while(left < right){
            if((nums[left] % 2 != 0) && (nums[right] % 2 == 0)){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            }else{
                if(nums[left] % 2 == 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return nums;
    }
}