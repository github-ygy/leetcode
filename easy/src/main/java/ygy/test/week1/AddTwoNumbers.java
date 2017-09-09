package ygy.test.week1;

/**
 * Created by guoyao on 2017/9/3.
 */
public class AddTwoNumbers {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     */
    public static void main(String[] args) throws Exception {
        ListNode l1 = new ListNode(9);
        //ListNode node2 = new ListNode(8);
        //ListNode node3 = new ListNode(9);
        ListNode headNode=new ListNode(0);
        ListNode temp  = headNode ;
        ListNode l2 = new ListNode(1);
        for(int i = 0 ; i < 9 ;i ++ ) {
            temp.next=new ListNode(9);
            temp = temp.next ;
        }
        l2.next = headNode.next ;

        ListNode listNode=addTwoNumbers(l1, l2);
       do {
           System.out.println(listNode.val);
           listNode=listNode.next;
       }while (listNode != null );
    }

    //正解
    public ListNode addTwoNumbers_lettCode_answer(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    //会超出int 和long的界限
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) throws Exception {

        StringBuilder l1Builder=new StringBuilder();
        while (l1 != null) {
            l1Builder.append(l1.val);
            l1 = l1.next;
        }
        l1Builder.reverse();
        long l1Num=Long.valueOf(l1Builder.toString());
        l1Builder=new StringBuilder();
        while (l2 != null) {
            l1Builder.append(l2.val);
            l2 = l2.next;
        }
        l1Builder.reverse();
        long l2Num=Long.valueOf(l1Builder.toString());

        long l3Num=l1Num + l2Num;

        //将l3转化为 listNode
        char[] chars=String.valueOf(l3Num).toCharArray();
        ListNode tempNode=new ListNode( 0);
        ListNode l3 = tempNode ;
        for(int i = chars.length - 1 ;i >= 0 ; i --) {
            l3.next=new ListNode(Integer.valueOf(""+chars[i]));
            l3 = l3.next;
        }
        return  tempNode.next ;
    }





}

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

