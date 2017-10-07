package ygy.test.week6;

/**
 * Created by guoyao on 2017/10/7.
 */
public class MergeSortedArray {

    public static void main(String[] args) {

    }


    //从大到小的倒序排序
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while (i>-1 && j>-1) nums1[k--]= (nums1[i]>nums2[j]) ? nums1[i--] : nums2[j--];
        while (j>-1)         nums1[k--]=nums2[j--];
    }
}
