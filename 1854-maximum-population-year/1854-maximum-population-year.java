class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101]; // for 1950 to 2050

        // Count population for each year
        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];

            // person alive from birth to death-1
            for (int y = birth; y < death; y++) {
                years[y - 1950]++;
            }
        }

        int maxPop = 0;
        int ans = 1950;

        // Find earliest year with maximum population
        for (int i = 0; i < 101; i++) {
            if (years[i] > maxPop) {
                maxPop = years[i];
                ans = i + 1950;
            }
        }

        return ans;
    }
}