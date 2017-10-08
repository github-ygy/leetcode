package ygy.test.week6;

/**
 * Created by guoyao on 2017/10/8.
 */
public class SameTree {

    public static void main(String[] args) {

    }

    /**
     * Given two binary trees, write a function to check if they are equal or not.
     * <p>
     * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
     */

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)  return true;
        if(p == null || q == null) return false;

        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        return false;
    }


}

/**
 * Definition for a binary tree node.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val=x;
    }
}
