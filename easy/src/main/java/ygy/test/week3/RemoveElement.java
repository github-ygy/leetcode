package ygy.test.week3;

/**
 * Created by guoyao on 2017/9/16.
 */
public class RemoveElement {

    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return  0 ;
        }
        int index = 0 ;
        for ( int i = 0 ; i< nums.length ; i ++) {
            if (nums[i] != val) {
                nums[index]=nums[i];
                index ++ ;
            }
        }
        return index ;
    }
}
