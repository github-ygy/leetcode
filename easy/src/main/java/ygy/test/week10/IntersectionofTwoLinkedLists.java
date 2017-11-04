package ygy.test.week10;

/**
 * Created by guoyao on 2017/11/3.
 */
public class IntersectionofTwoLinkedLists {


    public static void main(String[] agrs) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode reverseA=reverse(headA);
        ListNode reverseB=reverse(headB);
        ListNode temp = null ;
        while (reverseA != null && reverseB != null) {
            if (reverseA == reverseB) {
                temp = reverseA ;
                reverseA =reverseA.next;
                reverseB = reverseB.next ;
                continue;
            }
        }
        return reverse(temp);
    }

    public  ListNode reverse(ListNode head) {
        ListNode cacheNode = null ;
        while (head != null) {
            ListNode temp = head.next ;
            head.next = cacheNode ;
            cacheNode = head ;
            head = temp;
        }
        return cacheNode;
    }

    //leetcode answer
    public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }


    //leetcode answer
    public ListNode getIntersectionNode_2(ListNode headA, ListNode headB) {
        int lenA = length(headA), lenB = length(headB);
        // move headA and headB to the same start point
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenA < lenB) {
            headB = headB.next;
            lenB--;
        }
        // find the intersection until end
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int length(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val=x;
        next=null;
    }
}

/**
 * Definition for singly-linked list.
 */
