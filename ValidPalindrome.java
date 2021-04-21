/**
 * ValidPalindrome
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase() ;
        System.out.println(s);
        for (int i = 0; i < s.length()/2; i++) {
            if(!(s.charAt(i) == s.charAt(s.length()-i-1))) 
                return false ;
        }
        return true ;
        
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")) ;
    }
}
