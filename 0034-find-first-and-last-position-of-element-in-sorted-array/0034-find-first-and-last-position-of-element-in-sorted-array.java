class Solution {
    public int[] searchRange(int[] nums, int target){
           int[] result = {-1,-1};

            result[0]=findFirst(nums,target);
            if(result[0]==-1){
                return result;
            } 
            result[1]=findLast(nums,target);
            return result;
    }

    public int findFirst(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        

        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            if(nums[mid]>target){
                high=mid-1;
            }
            if(nums[mid]<target){
                low=mid+1;
            }
        }
        return ans;
    }

    public int findLast(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        

        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            if(nums[mid]>target){
                high=mid-1;
            }
            if(nums[mid]<target){
                low=mid+1;
            }
        }
        return ans;
    }
}