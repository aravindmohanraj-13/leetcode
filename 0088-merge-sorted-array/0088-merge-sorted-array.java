import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Vector<Integer> a =new Vector<>();
        Vector<Integer> b =new Vector<>();
        for(int i = 0 ; i < m ; i++){
            a.add(nums1[i]);
        }
        for(int i = 0 ; i < n ; i++){
            b.add(nums2[i]);
        }
        a.addAll(b);
        Collections.sort(a);
        for(int i = 0 ; i < nums1.length ; i++){
            nums1[i] = a.get(i);
        }
    }
}