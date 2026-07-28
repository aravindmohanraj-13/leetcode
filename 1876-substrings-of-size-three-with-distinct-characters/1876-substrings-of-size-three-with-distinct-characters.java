class Solution {
    public int countGoodSubstrings(String s) {
        int j = 0, k = 0;
        int count = 0;
        char [] c = s.toCharArray();
        for(int i = 0 ; i < c.length - 2 ; i++){
            j = i + 1;
            k = j + 1;
            if(c[i] != c[j] && c[j] != c[k] && c[k] != c[i]){
                count++;
            }
        }
        return count;
    }
}