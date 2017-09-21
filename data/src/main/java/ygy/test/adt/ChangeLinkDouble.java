package ygy.test.adt;

/**
 * Created by guoyao on 2017/9/20.
 */
public class ChangeLinkDouble {

    public static void main(String[] agrs) {

    }

    /**
     * 使用双链表交换相邻两个元素
     */
    public static void changeNode(ListNodeDouble root) {
        ListNodeDouble l1, l2;
        l1 = root.next ;
        l2 = l1.next ;
        l1.next = l2.next ;
        l2.next = l1 ;
        l1.next.pre = l1 ;
        root.next = l2 ;
        l1.pre = l2 ;
        l2.pre = root ;
    }
}

class ListNodeDouble {

    int x  ;

    ListNodeDouble next ;

    ListNodeDouble pre ;

    ListNodeDouble(int x ) {
        this.x = x ;
    }

    ListNodeDouble(int x , ListNodeDouble next , ListNodeDouble pre) {
        this.x = x ;
        this.next = next ;
        this.pre = pre ;
    }
}


