class Solution { 
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        int max = nums[0];
        int min = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        while(min <= max){
            if(!set.contains(min)){
                list.add(min);
            }
            min++;
        }
        return list;
    }
}