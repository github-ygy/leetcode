package ygy.test.adt;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guoyao on 2017/9/20.
 */
public class PrintLots {

    public static void main(String[] args) {
        List<Integer> list1=new LinkedList<>();
        List<String> list2=new LinkedList<>();
        list1.add(1);
        list1.add(4);
        list1.add(5);
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        list2.add("f");
        list2.add("g");
        printLots(list1, list2);
    }

    /**
     * p : 1 2  4 6
     * 打印q中索引为 1 2 4 6 的元素
     */
    public static void printLots(List<Integer> p , List<String> q) {

        Iterator<Integer> pItor=p.iterator();
        Iterator<String> qItor=q.iterator();
        Integer curr ;
        int start = 0 ;
        String currStr = null  ;
        while (pItor.hasNext() && qItor.hasNext()) {
            curr=pItor.next();
            while (start < curr && qItor.hasNext()) {
                start ++ ;
                currStr = qItor.next();
            }
            System.out.println(currStr);
        }
    }
}
