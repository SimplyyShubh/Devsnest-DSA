import java.util.* ;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        HashSet<Character> seta = new HashSet<>();
        HashSet<Character> setb = new HashSet<>();
        // HashMap<Integer,Integer> a = new HashMap<>() ;

        if (s.length() != t.length())
            return false;

        Arrays.sort(s.toCharArray());
        Arrays.sort(t.toCharArray());

        for (Character c : s.toCharArray()) {
            seta.add(Character.toLowerCase(c));
        }
        for (Character c : t.toCharArray()) {
            setb.add(Character.toLowerCase(c));
        }

        return seta.size() == setb.size();
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
