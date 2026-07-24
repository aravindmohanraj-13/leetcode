class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int>arr;
        for(int i=0;i<nums1.size();i++){
            arr.push_back(nums1[i]);
        }
        for(int i=0;i<nums2.size();i++){
            arr.push_back(nums2[i]);
        }
        sort(arr.begin(),arr.end());
        int n=arr.size();
        if(n%2!=0){
            return arr[n/2];
        }
        int i=n/2;
        return (arr[i-1]+arr[i])/2.0;
    }
};