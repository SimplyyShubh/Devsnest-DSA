public class MssingNumber {
    public static int  missingNumber(int[] nums) {
        int[] x = new int[nums.length+1] ;

        for (int i = 0; i < nums.length; i++) {
            x[nums[i]] = 1 ;    
        }
        for (int i = 0; i < x.length; i++) {
            if(x[i] != 1) 
                return i ;
        }
        return -1 ;
    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1,0,3}));
    }
}
