package ygy.test.week2;

/**
 * Created by guoyao on 2017/9/9.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(Integer.MIN_VALUE));

    }

    /**
     * Reverse digits of an integer.
     * Example1: x = 123, return 321
     * Example2: x = -123, return -321
     */
    public static int reverse(int x) {

        long num = (long) x;
        long temp=Math.abs(num);
        if (temp == 0) {
            return 0;
        }
        StringBuilder sb=new StringBuilder();
        while (temp >= 10) {
            sb.append(temp % 10);
            temp=temp / 10;
        }
        sb.append(temp % 10);
        //翻转可能会出现溢出的问题
        long resultInt=Long.valueOf(sb.toString());
        if (resultInt > Integer.MAX_VALUE) {
            return  0;
        }

        int result  = (int )resultInt ;
        return x > 0 ? result : 0 - result;
    }
}
