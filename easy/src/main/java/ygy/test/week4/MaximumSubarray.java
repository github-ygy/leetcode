package ygy.test.week4;

/**
 * Created by guoyao on 2017/9/24.
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray_2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }

    //{ -1 , -2 , 3 , -4 , 9 , 2,24 ,-12}

    public static int maxSubArray(int[] nums) {
        int sum=0;
        int lastSum=Integer.MIN_VALUE;
        for (int i=0; i < nums.length; i++) {
            if (sum < 0) {
                sum=nums[i];
            } else {
                sum+=nums[i];
            }
            if (sum > lastSum) {
                lastSum=sum;
            }
        }
        return lastSum;
    }

    //leetcode
    public static int maxSubArray_2(int[] nums) {
        int subNum=nums[0];
        int maxNum=nums[0];
        for (int i=1; i < nums.length; i++) {
            subNum=Math.max(subNum + nums[i], nums[i]);
            maxNum=Math.max(maxNum, subNum);
        }
        return goingNum;
    }
}
