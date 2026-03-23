class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if (nums1.length == 0 || nums2.length == 0) return res;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (a[0] + a[1]) - (b[0] + b[1])
        );

        // Step 1: push first column
        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }

        // Step 2: extract k pairs
        while (k-- > 0 && !pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0], v = curr[1], j = curr[2];

            res.add(Arrays.asList(u, v));

            if (j + 1 < nums2.length) {
                pq.offer(new int[]{u, nums2[j + 1], j + 1});
            }
        }

        return res;
    }
}