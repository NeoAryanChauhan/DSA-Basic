class Solution {
    public int kthElement(int a[], int b[], int k) {
        if (a.length > b.length) return kthElement(b, a, k); 

        int left = Math.max(0, k - b.length), right = Math.min(k, a.length);
        
        while (left <= right) {
            int x = left + (right - left) / 2;
            int y = k - x;
            
            int lA = (x > 0) ? a[x - 1] : Integer.MIN_VALUE;
            int lB = (y > 0) ? b[y - 1] : Integer.MIN_VALUE;
            int rA = (x < a.length) ? a[x] : Integer.MAX_VALUE;
            int rB = (y < b.length) ? b[y] : Integer.MAX_VALUE;
            
            if (lA <= rB && lB <= rA) {
                return Math.max(lA, lB);
            } else if (lA > rB) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return -1; 
    }
}

// TC : O(log min(m,n))
// SC : O(1)