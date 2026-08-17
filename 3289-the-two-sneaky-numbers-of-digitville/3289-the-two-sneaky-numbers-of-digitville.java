class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        int j = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > 1){
                list.add(num);
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
} 