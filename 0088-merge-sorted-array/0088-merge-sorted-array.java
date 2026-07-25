class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start=m-1;
        int end=n-1;
        int k=m+n-1;
        while(start>=0 && end>=0){
            if(nums1[start]>nums2[end]){
                nums1[k--]=nums1[start];
                start--;
            }
            else{
                nums1[k--]=nums2[end];
                end--;
            }
        }

        while(end>=0){
            nums1[k--]=nums2[end];
            end--;
        }

        while(start>=0){
            nums1[k--]=nums1[start];
            start--;
        }
    }
}