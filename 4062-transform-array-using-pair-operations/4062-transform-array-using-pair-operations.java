class Solution {
    public boolean canTransform(int[] source, int[] target) {
        Long sum1 = 0L;
        Long sum2 = 0L;
        for(int i = 0 ; i < source.length ; i++){
            sum1 += source[i];
            sum2 += target[i];
        }
        if(sum1.equals(sum2)) return true;
        else return false;
    }
}