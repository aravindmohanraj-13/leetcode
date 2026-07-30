class Solution {
    public int minimumPushes(String word) {
        int[] charArr = new int[26];
        for (char ch : word.toCharArray()) {
            charArr[ch - 'a']++;
        }
        Arrays.sort(charArr);
        int push = 0;
        int multi = 1;
        int count = 0;
        for (int i = 25; i >= 0; i--) {
            if (charArr[i] == 0) break;
            push += charArr[i] * multi;
            count++;
            if (count == 8) {
                count = 0;
                multi++;
            }
        }
        return push;
    }
}