import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Step 1: Find two possible candidates
        for (int i = 0; i < nums.length; i++) {

            if (candidate1 == nums[i]) {
                count1++;
            }
            else if (candidate2 == nums[i]) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1) {
                count1++;
            }
            else if (nums[i] == candidate2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            list.add(candidate1);
        }

        if (count2 > nums.length / 3) {
            list.add(candidate2);
        }

        return list;
    }
}