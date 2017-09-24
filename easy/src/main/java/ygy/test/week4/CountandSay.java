package ygy.test.week4;

/**
 * Created by guoyao on 2017/9/24.
 */
public class CountandSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    //1
    //11
    //21
    //1211

    public static String countAndSay(int n) {
        StringBuilder temp=new StringBuilder("1");
        StringBuilder stringBuilder;
        int count;
        for (int i=1; i < n; i++) {
            stringBuilder=temp;   //1
            temp=new StringBuilder();  // " "
            count = 1 ;
            char ch=stringBuilder.charAt(0);  // 1
            for (int j=1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) != ch) {
                    temp.append(count).append(ch);
                    count=1;
                    ch=stringBuilder.charAt(j);
                    continue;
                }
                count++;
            }
            temp.append(count).append(ch);    //11
        }
        return temp.toString();
    }
}
