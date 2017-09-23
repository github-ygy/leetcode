package ygy.test.week4;

/**
 * Created by guoyao on 2017/9/23.
 */
public class ImplementstrStr {

    public static void main(String[] args) {
        System.out.println(strStr("a","a"));
    }

    /**
     * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * 大串包小串
     */

    public  static  int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return  0 ;
        }

        for(int i = 0 ; i < (haystack.length() - needle.length() + 1) ;i ++) {
            if (haystack.substring(i, needle.length() + i).equals(needle)) {
                return i;
            }
        }
        return  -1 ;
    }
}
