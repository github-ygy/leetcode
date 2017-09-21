package ygy.test.week2;

/**
 * Created by guoyao on 2017/9/9.
 */
public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(2);
        ListNode listNode5=new ListNode(1);
        listNode1.next = listNode2 ;
        listNode2.next = listNode3 ;
        listNode3.next = listNode4 ;
        listNode4.next = listNode5 ;
        listNode5.next = null ;
        System.out.println(isPalindrome(listNode1));
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null ){
            return true ;
        }
        ListNode temp1=head ,temp2 = head;
        //temp1 比temp快一倍，获取整个head的中间链表
        while (temp1 != null && temp1.next != null ) {
            temp1 = temp1.next.next ;
            temp2 =temp2.next ;
        }
        //翻转后比对数据
        ListNode reverseNode=reverseNode(temp2);
        while (reverseNode != null) {
            if (reverseNode.val != head.val) {
                return false;
            }
            reverseNode = reverseNode.next ;
            head=head.next;
        }
        return true;
    }

    private static ListNode reverseNode(ListNode head) {  //l1 l2 l3
        ListNode temp = null ;
        while (head != null) {
            ListNode nextNode = head.next ;  // l2 l3  // l3  // null
            head.next = temp ;            // null     //l1 null   // l2 l1 null
            temp = head ;                 //l1  null     // l2 l1 null  //l3 l2 l1 null
            head = nextNode ;            // l2 l3    //l3   //
        }
        return temp ;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val=x;
    }
}
