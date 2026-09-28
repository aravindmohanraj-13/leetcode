class Solution {
    public int maxDepth(String s) {
        int count = 0 ;
        int maxm = 0;
        for(char p : s.toCharArray()) {
            if(p =='(') count++;
            if(p == ')') count--;
            maxm = Math.max(count, maxm);
        }
        return maxm;
    }
}