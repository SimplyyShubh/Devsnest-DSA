public class ValidPalindrome_two {
    
    public static boolean validPalindrome(String s) {
        
        for (int i = 0; i < s.length()/2; i++) {

            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return 
                    isPalindrome(s.substring(i+1, s.length()-i)) ||
                    isPalindrome(s.substring(i, s.length()-i-1)) ;
            }
                
        }
        return true ;
    }

     public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(!(s.charAt(i) == s.charAt(s.length()-i-1))) 
                return false ;
        }
        return true ;
        
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abc")) ;
    }
}
