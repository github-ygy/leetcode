package ygy.test.week3;

/**
 * Created by guoyao on 2017/9/15.
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {

    }

    /**
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the first two lists.
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempHeadNode=new ListNode(0);
        ListNode current = tempHeadNode ;
        while (l1 != null) {
            int temp =  l1.val ;
            while (l2 != null && temp > l2.val ) {
                current.next =new ListNode(l2.val);
                current = current.next ;
                l2=l2.next;
            }
            current.next=new ListNode(temp);
            current = current.next ;
            l1 = l1.next ;
        }
        current.next = l2 ;
        return  tempHeadNode.next ;
    }

    //leet code 参考答案
    public ListNode mergeTwoLists_2(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val=x;
    }
}
