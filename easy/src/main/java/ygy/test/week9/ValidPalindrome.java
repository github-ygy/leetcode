package ygy.test.week9;

/**
 * Created by guoyao on 2017/10/27.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));

    }

    /**
     *
     Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     For example,
     "A man, a plan, a canal: Panama" is a palindrome.
     "race a car" is not a palindrome.
     */
    public static boolean isPalindrome(String s) {

        if (s == null || s.length() == 0) return true;

        int head = 0 ;
        int tail = s.length() - 1;

        while (head <= tail) {
            char headChar=s.charAt(head);
            char tailChar=s.charAt(tail);
            if ( !Character.isLetterOrDigit(headChar)) {
                head++;
            } else if (!Character.isLetterOrDigit(tailChar)) {
                tail--;
            } else {
                head++;
                tail-- ;
                if ((Character.isDigit(headChar) || Character.isDigit(tailChar)) && headChar !=tailChar )
                    return false;

                if (headChar == tailChar ||Math.abs(headChar -tailChar) == 32)
                    continue;

                return false;
            }
        }
        return true;
    }


}
