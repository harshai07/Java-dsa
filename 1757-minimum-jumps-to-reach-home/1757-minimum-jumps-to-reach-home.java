public class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<Integer> forbid = new HashSet<>();
        for (int f : forbidden) forbid.add(f);

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0}); // {position, lastMoveBack? 0=no, 1=yes}

        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        int steps = 0;
        int limit = 6000;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int pos = curr[0];
                int back = curr[1];

                if (pos == x) return steps;

                // forward jump
                int forward = pos + a;
                if (forward <= limit && !forbid.contains(forward)
                    && !visited.contains(forward + ",0")) {

                    visited.add(forward + ",0");
                    q.offer(new int[]{forward, 0});
                }

                // backward jump (only if last move wasn't backward)
                int backward = pos - b;
                if (back == 0 && backward >= 0
                    && !forbid.contains(backward)
                    && !visited.contains(backward + ",1")) {

                    visited.add(backward + ",1");
                    q.offer(new int[]{backward, 1});
                }
            }

            steps++;
        }

        return -1;
    }
}