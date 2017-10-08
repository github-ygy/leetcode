package ygy.test.week6;

/**
 * Created by guoyao on 2017/10/8.
 */
public class SymmetricTree {

    public static void main(String[] args) {

    }

    /**
     * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     *          1
              / \
             2   2
           / \ / \
         3  4 4  3
     */
    public static boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricSameTree(root.left, root.right);
    }

    public static boolean isSymmetricSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)  return true;
        if(p == null || q == null) return false;

        if(p.val == q.val)
            return isSymmetricSameTree(p.left, q.right) && isSymmetricSameTree(p.right, q.left);
        return false;

    }
}

/**
 * Definition for a binary tree node.
 */

