import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i+1; j < nums.length; j++) {
        // if(nums[i]+ nums[j] == target)
        // return new int[]{i,j} ;
        // }
        // }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int res = target - nums[i];
            if (map.containsKey(res))
                return new int[] {map.get(res), i};
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
    }
}
