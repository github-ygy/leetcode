package ygy.test.week5;

/**
 * Created by guoyao on 2017/10/1.
 */
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("1","111"));

    }

    /**
     * Given two binary strings, return their sum (also a binary string).
     For example,
     a = "11"
     b = "1"
     Return "100".
     */
    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder=new StringBuilder();
        int z = 0 ;
        int n=Math.max(a.length(), b.length());
        for (int i = 0 ; i< n;i ++ ) {
            int x = 0 ;
            if ((a.length() - 1 - i) > -1) {
                x=Integer.valueOf(a.substring(a.length() - 1 - i,a.length()- i));
            }
            int y= 0 ;
            if ((b.length() - 1 - i) > -1) {
                y =Integer.valueOf(b.substring(b.length() - 1 - i,b.length()- i));
            }
            if ((x + y + z) > 1) {
                stringBuilder.append((x + y +z - 2));
                z=1;
            } else {
                stringBuilder.append((x + y + z));
                z=0;
            }
        }
        if (z > 0) {
            stringBuilder.append(z);
        }
        return stringBuilder.reverse().toString();
    }

    //leetcode answer
    public String addBinary_2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
