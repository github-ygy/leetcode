package ygy.test.week4;

/**
 * Created by guoyao on 2017/9/23.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 56, 467};
        System.out.println(searchInsert(nums, 5));
    }

    /**
     *Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     You may assume no duplicates in the array.
     Here are few examples.
     [1,3,5,6], 5 → 2
     [1,3,5,6], 2 → 1
     [1,3,5,6], 7 → 4
     [1,3,5,6], 0 → 0
     */

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1 && target < nums[0]) {
            return 0;
        }
        int start = 0 , end = nums.length -1 ;
        int mid=(start + end) >> 1;
        while (start <= end) {
            if (nums[mid] > target) {
                end=mid - 1;
            } else if (nums[mid] < target) {
                start=mid + 1;
            } else {
                return mid  ;
            }
            mid =  (start + end ) >> 1 ;
        }
        return  mid + 1 ;

    }

}
