class Solution {
    int floorSqrt(int n) {
        int left = 1, right = n, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == n) return mid;
            if (square < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

// TC : O(log n)
// SC : O(1)