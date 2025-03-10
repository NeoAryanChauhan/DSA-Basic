class Solution {
    public int pairWithMaxSum(int arr[]) {
        int maxSum = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}

// TC : O(n)
// SC : O(1)