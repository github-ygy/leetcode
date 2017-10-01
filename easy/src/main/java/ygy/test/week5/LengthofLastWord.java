package ygy.test.week5;

/**
 * Created by guoyao on 2017/10/1.
 */
public class LengthofLastWord {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("hello "));
    }

    public static int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}
