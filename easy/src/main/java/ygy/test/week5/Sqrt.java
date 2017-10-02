package ygy.test.week5;

/**
 * Created by guoyao on 2017/10/2.
 */
public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(2));

    }

    /**
     * Implement int sqrt(int x).
     Compute and return the square root of x.
     */
    //leetcode答案
    public static int mySqrt(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
}
