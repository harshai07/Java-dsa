class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
         int n = profit.length;

        // Create job list: [difficulty, profit]
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }

        // Sort jobs by difficulty
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // Sort worker abilities
        Arrays.sort(worker);

        int i = 0;
        int best = 0;
        int res = 0;

        // Two-pointer sweep for best profit available
        for (int ability : worker) {
            while (i < n && jobs[i][0] <= ability) {
                best = Math.max(best, jobs[i][1]);
                i++;
            }
            res += best;
        }

        return res;
        
    }
}