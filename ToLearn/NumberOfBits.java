package ToLearn;

public class NumberOfBits {
     public static int hammingWeight(int n) {
         int sum = 0;
    while (n != 0) {
        sum++;
        n &= (n - 1);
    }
    return sum;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(255));
    }
}
