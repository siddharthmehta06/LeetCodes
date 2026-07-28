import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a = nums[i];
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int b = nums[j];
                int p = j + 1;
                int q = n - 1;
                while (p < q) {
                    long sum = (long) a + b + nums[p] + nums[q];
                    if (sum == target) {
                        list.add(Arrays.asList(a, b, nums[p], nums[q]));
                        p++;
                        q--;
                        while (p < q && nums[p] == nums[p - 1]) {
                            p++;
                        }
                        while (p < q && nums[q] == nums[q + 1]) {
                            q--;
                        }
                    } else if (sum < target) {
                        p++;
                    } else {
                        q--;
                    }
                }
            }
        }
        return list;
    }
}