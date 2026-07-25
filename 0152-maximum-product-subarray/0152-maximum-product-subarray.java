class Solution {
    public int maxProduct(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prefix[i - 1] == 0) {
                prefix[i] = nums[i];
            }
             else {
                prefix[i] = prefix[i - 1] * nums[i];
            }
        }

        suffix[nums.length - 1] = nums[nums.length - 1];

        for (int j = nums.length - 2; j >= 0; j--) {
            if (suffix[j + 1] == 0) {
                 suffix[j] = nums[j];
            } 
            else {
            suffix[j] = suffix[j + 1] * nums[j];
            }
        }

        int max1=prefix[0];
        for(int i=1;i<nums.length;i++){
            if(max1<prefix[i]){
                max1=prefix[i];
            }
        }

        int max2=suffix[0];
        for(int i=0;i<nums.length;i++){
            if(max2<suffix[i]){
                max2=suffix[i];
            }
        }

        if(max1>max2){
            return max1;
        }else{
            return max2;
        }


        
    }
}