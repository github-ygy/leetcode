package ygy.test.week2;

/**
 * Created by guoyao on 2017/9/10.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String [] arrs = {"abc","abcd","abcde","ab"};
        System.out.println(longestCommonPrefix(arrs));
    }

    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     */
    public  static  String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return  "" ;
        }
        String longestPrefix="";
        int index=0;
        for (String str : strs) {
            if (str == null || str.length()==0) {
                return "";
            }
            if (index == 0) {
                longestPrefix = str ;
                index++;
                continue;
            }
            longestPrefix = findCommonPreFix(longestPrefix,str);
            index ++;
        }
        return  longestPrefix ;
    }

    public static String findCommonPreFix(String longestPrefix, String str) {

        String temp="";
        for (int i = 1 ;i <= longestPrefix.length();i++ ) {
            temp=longestPrefix.substring(0, i);
            if (!str.startsWith(temp)) {
                return str.substring(0, i-1);
            }
            continue;
        }
        return temp;
    }
}
