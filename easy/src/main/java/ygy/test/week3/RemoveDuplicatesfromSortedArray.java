package ygy.test.week3;

/**
 * Created by guoyao on 2017/9/15.
 */
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new Integer[]{1,1,2,2,2,2,2,2,3,4,5,5,6}));
        System.out.println(removeDuplicates_2(new int[]{1,1,2,2,2,2,2,2,3,4,5,5,6}));
    }

    /**
     Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
     Do not allocate extra space for another array, you must do this in place with constant memory.
     For example,
     Given input array nums = [1,1,2],
     Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     It doesn't matter what you leave beyond the new length.
     */
    public static int removeDuplicates(Integer[] nums) {
        int lastValue = 0   ;
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i ++) {
            if (i == 0) {
                lastValue = nums[i] ;
                count ++ ;
                continue;
            }
            if (nums[i]== lastValue) {
              continue;
            }
            lastValue = nums[i];
            count ++;
        }
        return  count;
    }

    //leet code 参考答案
    public static int removeDuplicates_2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


}
