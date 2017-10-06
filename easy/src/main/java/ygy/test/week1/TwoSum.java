package ygy.test.week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    //leetcode answer
    public static int[] twoSum_2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return  null ;
    }
}
