package ygy.test.week10;

/**
 * Created by guoyao on 2017/11/5.
 */
public class ExcelSheetColumnTitle {

    public static void main(String[] agrs) {
        System.out.println(convertToTitle(30));
    }

    public  static  String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        return result.toString();
    }
}
