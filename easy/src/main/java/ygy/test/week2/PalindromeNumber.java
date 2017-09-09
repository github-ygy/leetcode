package ygy.test.week2;

/**
 * Created by guoyao on 2017/9/9.
 */
public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(0));
    }

    /**
     * //判断回文
     * Determine whether an integer is a palindrome.
     * Do this without extra space.　　不能使用额外空间
     */
    public static boolean  isPalindrome(int x) {

        //去除负数
        //去除10的整数
        if (x < 0 || (x %10 ==0 && x!= 0)) {
            return  false ;
        }

        int temp = 0 ;
        while (x > temp) {
            temp=temp * 10 + x % 10;
            x=x / 10;
        }
        return temp == x || temp /10 == x ;

        //方法1
        //if (x == ReverseInteger.reverse(x)) {
        //    return true;
        //}
        //return false;
    }
}
