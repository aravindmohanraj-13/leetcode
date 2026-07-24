class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : stones.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for(int i = 0 ; i < jewels.length() ; i++){
            if(map.containsKey(jewels.charAt(i))){
                count += map.get(jewels.charAt(i));
            }
        }
        return count;
    }
}