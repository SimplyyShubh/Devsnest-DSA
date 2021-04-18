import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0 || matrix[0].length == 0)
            return res;
            
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        int dir = 0;

        while (top <= bottom && left <= right) {
            if (dir == 0) { // top
                for (int i = left; i <= right; i++)
                    res.add(matrix[top][i]);
                top++;
            } else if (dir == 1) { // right
                for (int i = top; i <= bottom; i++)
                    res.add(matrix[i][right]);
                right--;
            } else if (dir == 2) { // bottom
                for (int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom--;
            } else if (dir == 3) { // left
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
