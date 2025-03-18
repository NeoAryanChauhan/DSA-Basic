class Solution {
    int median(int mat[][]) {
        int m = mat.length, n = mat[0].length;
        int low = mat[0][0], high = mat[m - 1][n - 1];
        int medianPos = (m * n) / 2 + 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int i = 0; i < m; i++) {
                count += upperBound(mat[i], mid);
            }

            if (count >= medianPos) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int upperBound(int[] row, int target) {
        int left = 0, right = row.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] <= target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}

// TC : O(log(max−min))*m * logn)
// SC : O(1)