public class MaximumSubarray {

    public static int solve(int[] nums) {
        int curr = nums[0] ;
        int res = nums[0] ;

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i],curr + nums[i]) ;
            res = Math.max(res, curr) ;
        }
        return res;
    }       

    public static void main(String[] args) {
        System.out.println(solve(new int[]{-2, 1, -3, 4, 5,-1, 2, 1, -5, 4}));
    }   
}       
