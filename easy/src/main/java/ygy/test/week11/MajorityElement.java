package ygy.test.week11;

/**
 * Created by guoyao on 2017/12/2.
 */
public class MajorityElement {

    public static void main(String[] agrs) {

    }


    /**
     * 给定一个大小为n的数组，查找多数元素。大多数元素是出现超过⌊N / 2⌋倍元。
     您可以假设数组是非空的，多数元素总是存在于数组中。
     */

    public int majorityElement(int[] nums) {

        int start = nums[0] , count = 1 ;

        for(int i = 1 ;i < nums.length ; i++) {
            if (start == nums[i]) {
                count++;
            } else if (count  == 0) {
                count ++;
                start=nums[i];
            }else {
                count--;
            }
        }
        return  start ;
    }
}
