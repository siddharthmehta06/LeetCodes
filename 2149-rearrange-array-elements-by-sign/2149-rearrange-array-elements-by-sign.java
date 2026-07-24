class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int p=0;
        int q=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                result[q]=nums[i];
                q+=2;
            }
            else{
                result[p]=nums[i];
                p+=2;
            }
        }

        return result;

    }
}