package ygy.test.week6;

/**
 * Created by guoyao on 2017/10/7.
 */
public class RemoveDuplicatesfromSortedList {

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(1);
        ListNode l3=new ListNode(1);
        l1.next = l2 ;
        l2.next = l3 ;
        ListNode new_l1=deleteDuplicates(l1);
        System.out.println(" -------------------------- ");
        do {
            System.out.println(new_l1.val);
            new_l1=new_l1.next;
        }while (new_l1 != null );
    }


    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return  null ;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head ;
        ListNode tempNode = head ;
        int temp = head.val;
        head = head.next ;
        while (head!= null ) {
            if (head.val != temp) {
                tempNode = head ;
                temp = head.val ;
                head = head.next ;
                continue;
            }
            tempNode.next = head.next ;
            head = head.next ;
        }
        return  dummyHead.next ;
    }


    //leetcode answer
    public static ListNode deleteDuplicates_2(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}


/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val=x;
    }
}