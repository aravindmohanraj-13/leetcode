class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        int l = 0;
        while(l < arr.length){
            if(arr[l] % 2 == 1) count++;
            else count = 0;
            if(count == 3) return true;
            l++;
        }
        return false;
    }
}