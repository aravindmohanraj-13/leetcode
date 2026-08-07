class Solution {
    public int[] getConcatenation(int[] nums) {
        // int n = nums.length * 2;
        // int[] result = Arrays.copyOf(nums, nums.length + nums.length);
        // System.arraycopy(nums, 0, result, nums.length, nums.length);
        // return result;
        int [] res = new int [2 * nums.length];
        int i = 0;
        for(int num : nums){
            res[i++] = num;
        }
        for(int num : nums){
            res[i++] = num;
        }
        return res;
    }
}