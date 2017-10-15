package ygy.test.week7;

/**
 * Created by guoyao on 2017/10/15.
 */
public class ConvertSortedArraytoBinarySearchTree {


    public static void main(String[] args) {


    }

    /**
     * Given an array where elements are sorted in ascending order,
     * convert it to a height balanced BST.
     */

    public static TreeNode sortedArrayToBST(int[] nums) {
       if(nums == null || nums.length == 0) return null;
        return  makeTree(nums, 0, nums.length - 1);
    }

    //利用二分查找分离
    public static TreeNode makeTree(int[] nums, int i, int j) {
        if(i > j) return  null ;
        int mid=(i + j) >> 1;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=makeTree(nums, i, mid - 1);
        root.right=makeTree(nums, mid + 1, j);
        return root ;
    }
}
