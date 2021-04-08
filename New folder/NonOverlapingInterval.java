import java.util.*;

public class NonOverlapingInterval {
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length < 2)
            return 0;
        Arrays.sort(intervals, (int[] a, int[] b) -> a[0] - b[0]); // sorting by a[0] is enough
        int ans = 0, end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                end = Math.min(intervals[i][1], end); // keep early finished event
                ans++;
            } else {
                end = intervals[i][1]; // not overlapping, update the end time by later event
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
