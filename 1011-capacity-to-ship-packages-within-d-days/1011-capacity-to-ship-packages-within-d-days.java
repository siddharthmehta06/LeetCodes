class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = weights[0];
        int high = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > low) {
                low = weights[i];
            }
            high += weights[i];
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean canShip(int[] weights, int days, int capacity) {

        int requiredDays = 1;
        int currentWeight = 0;

        for (int i = 0; i < weights.length; i++) {

            if (currentWeight + weights[i] <= capacity) {
                currentWeight += weights[i];
            } else {
                requiredDays++;
                currentWeight = weights[i];
            }
        }

        return requiredDays <= days;
    }
}
