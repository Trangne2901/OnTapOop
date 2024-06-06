public class checkSymmetry {
    public static boolean isPalindrome(String strings){
        int length = strings.length();
        for (int i = 0; i<strings.length();i++){
            if ( strings.charAt(i) != strings.charAt(length - 1 -i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("level" ));
        System.out.println(isPalindrome("abca" ));
        System.out.println(isPalindrome("tamancuthehee" ));
    }
}
