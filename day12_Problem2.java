class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int l = 0, r = nums.length - 1;
        
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) r = m - 1;
            else l = m + 1;
        }
        
        if (l < nums.length && nums[l] == target) result[0] = l;
        else return result;
        
        r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        
        result[1] = r;
        return result;
    }
}


// TC : O(log n)
// SC : O(1)