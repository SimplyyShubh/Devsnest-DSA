public class SetMatrixZeroes {
    public void setZeroes(int[][] a) {
        int[][] b = new int[2][Math.max(a.length,a[0].length)] ;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    b[0][i] = 1;
                    b[1][j] = 1;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(b[0][i] == 1 || b[1][j] == 1){
                    a[i][j] = 0 ;
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
