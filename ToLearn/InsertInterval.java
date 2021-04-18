import java.util.*;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int max = Math.max(start, intervals[i][0]);
            int min = Math.min(end, intervals[i][1]);
            // checking merge
            if (max <= min) {
                start = Math.min(start, intervals[i][0]);
                end = Math.max(end, intervals[i][1]);

            } else {
                res.add(new int[] { Math.min(start, intervals[i][0]), Math.min(end, intervals[i][1]) });
                start = Math.max(start, intervals[i][0]);
                end = Math.max(end, intervals[i][1]);
            }

        }
        res.add(new int[] { start, end });
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(insert(new int[][]{{1,3},{4,6},{9,12}},new int[]{2,6}))) ;
        
    }
}
