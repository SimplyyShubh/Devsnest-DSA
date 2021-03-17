import java.util.HashMap;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>() ;

        for(int i: nums){
            if(map.containsKey(i)){
                return true ;
            }
            else{
                map.put(i,0) ;
            }
        }

        return false ;
    }

    public static void main(String[] args) {
        
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5}));
    }
}