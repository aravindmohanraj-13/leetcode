import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int maxm = 0;
        HashMap<Integer, Integer> window = new HashMap<>();
        while (right < fruits.length) {
            window.put(fruits[right], window.getOrDefault(fruits[right], 0) + 1);
            while (window.size() > 2) {
                window.put(fruits[left], window.get(fruits[left]) - 1);
                if (window.get(fruits[left]) == 0) {
                    window.remove(fruits[left]);
                }
                left++;
            }
            maxm = Math.max(maxm, right - left + 1);
            right++;
        }
        return maxm;
    }
}