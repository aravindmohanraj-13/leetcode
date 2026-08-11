class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        HashSet <Integer> set = new HashSet<>();
     for(int i = 0 ; i < nums.length - 1 ; i++){
        if(nums[i] == nums[i + 1] - 1)
        sum += nums[i + 1];
        else break;
     }  
     for(int num : nums){
        set.add(num);
     } 
     while(true){
        if(!set.contains(sum))
        return sum;
        else sum += 1;
    }
    }
}