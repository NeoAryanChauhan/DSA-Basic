class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = 0;
        for (int num : nums) {
            if (num > right) right = num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }
            if (sum <= threshold) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

// TC : O(n log m)
// SC : O(n)