class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (pCount[i] == sCount[i]) {
                matches++;
            }
        }
        int left = 0;
        for (int right = p.length(); right < s.length(); right++) {
            if (matches == 26) {
                result.add(left);
            }
            int index = s.charAt(right) - 'a';
            sCount[index]++;
            if (sCount[index] == pCount[index]) {
                matches++;
            } else if (sCount[index] == pCount[index] + 1) {
                matches--;
            }
            index = s.charAt(left) - 'a';
            sCount[index]--;
            if (sCount[index] == pCount[index]) {
                matches++;
            } else if (sCount[index] == pCount[index] - 1) {
                matches--;
            }
            left++;
        }
        if (matches == 26) {
            result.add(left);
        }
        return result;
    }
}