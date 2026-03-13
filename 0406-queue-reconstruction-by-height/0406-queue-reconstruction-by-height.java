class SegmentTree {
    int n;
    int[] tree;

    SegmentTree(int N) {
        this.n = N;
        while (Integer.bitCount(n) != 1) {
            n++;
        }
        build(N);
    }

    void build(int N) {
        tree = new int[2 * n];
        for (int i = 0; i < N; i++) {
            tree[n + i] = 1;
        }
        for (int i = n - 1; i > 0; --i) {
            tree[i] = tree[i << 1] + tree[i << 1 | 1];
        }
    }

    void update(int i, int val) {
        tree[n + i] = val;
        for (int j = (n + i) >> 1; j >= 1; j >>= 1) {
            tree[j] = tree[j << 1] + tree[j << 1 | 1];
        }
    }

    int query(int l, int r) {
        int res = 0;
        for (l += n, r += n + 1; l < r; l >>= 1, r >>= 1) {
            if ((l & 1) == 1) res += tree[l++];
            if ((r & 1) == 1) res += tree[--r];
        }
        return res;
    }
}

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[][] res = new int[n][2];

        SegmentTree segTree = new SegmentTree(n);
        for (int[] p : people) {
            int l = 0, r = n - 1, idx = 0;
            while (l <= r) {
                int mid = (l + r) >> 1;
                int cnt = segTree.query(0, mid);
                if (cnt > p[1]) {
                    idx = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            res[idx] = p;
            segTree.update(idx, 0);
        }

        return res;
    }
}