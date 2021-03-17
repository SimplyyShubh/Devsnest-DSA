import java.util.Arrays;

public class ProductOfArraySelf {

    public static int[] prductExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int zero = 0, index = 0;
        int product = 1;

        for (int i = 0; i < res.length; i++) {
            if (nums[i] == 0) {
                if (zero == 0) {
                    zero++;
                    index = i;
                } else if (zero >= 1)
                    return (new int[nums.length]);
            } else {
                product *= nums[i];
            }

        }

        if (zero == 1) {
            res[index] = product;
        } else {
            for (int i = 0; i < res.length; i++) {
                res[i] = product / nums[i];
            }

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(prductExceptSelf(new int[] { 1, 0, 2, 3, 4 })));
    }
}
