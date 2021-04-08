import java.util.*;

public class UniqueFractions {

    public static int[][] solve(int[][] fractions) {

        HashMap<ArrayList<Integer>, Double> res = new HashMap<>();

        for (int[] i : fractions) {
            for (int j = Math.min(i[0], i[1]); j > 0; --j) {
                if ((i[0] % j == 0) && (i[1] % j == 0)) {

                    ArrayList<Integer> n = new ArrayList<>();
                    n.add(i[0] / j);
                    n.add(i[1] / j);
                    double v = i[0] / i[1];

                    if (!res.containsValue(v))
                        res.put(n, v);
                    break;
                    // res.add(n) ;
                }
            }
        }
        int[][] a = new int[res.size()][];
        int i = 0;
        for (Map.Entry<ArrayList<Integer>, Double> key : res.entrySet()) {
            a[i++] = new int[] { key.getKey().get(0), key.getKey().get(1) };
        }
        a

        return a;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solve(new int[][] { { 8, 6 }, { 2, 1 }, { 10, 2 } })));
    }
}
