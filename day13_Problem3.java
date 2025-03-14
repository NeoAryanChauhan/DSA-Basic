import java.util.*;

public class day13_Problem3{
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int l = 0, r = n - 1;
        int floor = -1, ceil = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (a[m] == x) {
                return new int[]{x, x};
            } else if (a[m] < x) {
                floor = a[m];
                l = m + 1;
            } else {
                ceil = a[m];
                r = m - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}

// TC : O(log n)
// SC : O(1)