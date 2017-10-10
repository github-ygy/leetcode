package ygy.test.adt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by guoyao on 2017/9/21.
 */
public class Share {

     static  List<LinkedList<Integer>> result1=new ArrayList<>();
     static  List<LinkedList<Integer>> result2=new ArrayList<>();

    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(1);
        l1.add(1);
        l1.add(1);
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(2);
        l2.add(2);
        l2.add(2);
        LinkedList<Integer> l3=new LinkedList<>();
        l3.add(3);
        l3.add(3);
        l3.add(3);
        List<LinkedList<Integer>> list=new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        //System.out.println(count(list));
        System.out.println(count_1(list));
        //System.out.println(result1);
        System.out.println(result2);

    }

    /**
     * 将N个披萨包含的N个相同原料混合成 N个包含N个不同原料的披萨
     */
    public static int count(List<LinkedList<Integer>>  nList) {
        int count = 0 ;
        if (nList.size() == 1) {
            result1.add(nList.get(0));
            return 0;
        }else {
            Stack<Integer> stack ;
            for(int i = 0 ; i < nList.size() -1  ; i ++) {
                stack=new Stack<>();
                LinkedList<Integer> integers=nList.get(i);
                stack.push(integers.removeLast());
                count ++ ;
                integers.addFirst(nList.get(nList.size()- 1).removeLast());
                count ++ ;
                nList.get(nList.size()- 1).push(stack.pop());
                count ++ ;
            }
            result1.add(nList.remove(nList.size() - 1));
            count  += count(nList);
        }
        return  count ;
    }

    public static int count_1(List<LinkedList<Integer>>  nList) {
        int count = 0 ;
        if (nList.size() == 1) {
            result2.add(nList.get(0));
            return 0;
        }else {
            Stack<Integer> stack =new Stack<>();
            stack.push(nList.get(0).removeLast());
            for(int i = 1; i < nList.size()  ; i ++) {
                LinkedList<Integer> integers=nList.get(i);
                nList.get(0).push(integers.removeLast());
                count ++ ;
                integers.addFirst(nList.get(0).removeLast());
                count ++ ;
            }
            count ++ ;
            nList.get(0).addFirst(stack.pop());
            result2.add(nList.remove(0));
            count  += count_1(nList);
        }
        return  count ;
    }


}
