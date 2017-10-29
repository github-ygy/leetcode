package ygy.test.week9;

/**
 * Created by guoyao on 2017/10/29.
 */
public class SingleNumber {

    public static void main(String[] args) {

    }

    /**
     * Given an array of integers, every element appears twice except for one. Find that single one.

     Note:
     Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     */

    public int singleNumber(int[] nums) {

        int head=nums[0];
        for(int i = 1 ;i < nums.length ; i++) {
            head^=nums[i];
        }
        return head;
    }
}
