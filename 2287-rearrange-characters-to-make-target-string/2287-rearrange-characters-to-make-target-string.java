class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int val = 0;
        while (true) {
            int count = 0;
            for (int i = 0; i < target.length(); i++) {
                char ch = target.charAt(i);
                if (map.containsKey(ch) && map.get(ch) > 0) {
                    map.put(ch, map.get(ch) - 1);
                    count++;
                } else {
                    return val;
                }
            }
            if (count == target.length())
                val++;
        }
    }
}