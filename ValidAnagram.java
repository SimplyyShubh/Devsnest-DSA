import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length())
            return false ;

        for (Character c : s.toCharArray())
            map.put(c, map.getOrDefault(c,0) + 1);

        for (Character c : t.toCharArray()){
            if(map.containsKey(c) && map.get(c) != 0)
                map.put(c, map.get(c) - 1) ;
            else
                return false ;
        }

        return true ;
    }

    public static void main(String[] args) {
        String s = "rfaec";
        String t = "caarf";
        System.out.println(isAnagram(s, t));
    }
}
