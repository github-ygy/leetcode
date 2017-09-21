package ygy.test.adt;

/**
 * Created by guoyao on 2017/9/20.
 */
public class ChangeLinkSingle {

    public static void main(String[] agrs) {

        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        l1.next = l2 ;
        l2.next = l3 ;
        l3.next =l4 ;
        l4.next = null ;

        changeNode(l1);
        while (l1 != null) {
            System.out.println( l1.x);
            l1=l1.next;
        }
    }

    /**
     * 使用单链表交换相邻两个元素
     */
    public static void changeNode(ListNode root) {
        ListNode l1,l2 ;    // root l1 l2
        l1 = root.next ;   //l1 l2 l3
        l2=l1.next;       //l2 l3
        l1.next  = l2.next ; // l1 l3
        root.next = l2;    // root l2
        l2.next = l1 ;    //root l2 l1 l3
    }
}


class ListNode{
    int x ;
    ListNode next ;

    ListNode(int x) {
        this.x = x ;
    }
}

