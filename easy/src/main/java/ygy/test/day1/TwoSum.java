package ygy.test.day1;

import java.util.Arrays;

/**
 * Created by guoyao on 2017/9/3.
 */
public class TwoSum {

    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15} ;
        System.out.println(Arrays.toString(twoSum(nums,26)));
    }

    public static int[] twoSum(int[] nums, int target) {

        for( int i = 0 ; i < nums.length -1 ; i ++) {   // n- 1
            for(int j = i + 1; j < nums.length; j ++) {   // n
                int result= nums[i] + nums[j];
                if (result == target) {           //时间复杂度O(n2)
                    return new int[]{i,j};
                }
            }
        }
        return  null ;
    }
}
