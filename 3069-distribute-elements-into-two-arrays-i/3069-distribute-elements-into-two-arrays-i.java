class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>arr1 = new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int j = 0;
        int k = 0;
        for(int i = 2 ; i < nums.length ; i++){
            if(arr1.get(j) > arr2.get(k)){
                arr1.add(nums[i]);
                j++;
            }
            else{
                arr2.add(nums[i]);
                k++;
            }
        }
    arr1.addAll(arr2);
    
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr1.get(i);
        }
        return nums;
    }
}