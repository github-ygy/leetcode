package ygy.test.week9;

/**
 * Created by guoyao on 2017/10/29.
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next = listNode3;
        //System.out.println(hasCycle_2(listNode1));
        ListNode temp = reverseList(listNode1);
        while (temp != null) {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    /**
     * Given a linked list, determine if it has a cycle in it.
     Follow up:
     Can you solve it without using extra space?
     */

    //leetcode answaer
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode temp=head,pre=head;
        while (temp!=null && temp.next != null) {
            if (head == temp.next) {
                return true;
            }
            temp = temp.next ;
            pre.next=head;
            pre = temp;
        }
        return false;
    }
    public static boolean hasCycle_2(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode fast=head,slow=head;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast=fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode reverse=null;
        while (head != null) {
            ListNode temp = head.next ;  // L2 L3 NULL  //L3 NULL
            head.next = reverse ;        //l1 null      //L2 L1 NULL
            reverse=head ;          // L1 NULL
            head = temp ;                //L2 L3 NULL   //l3 null
        }
        return reverse ;
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
        next=null;
    }
}