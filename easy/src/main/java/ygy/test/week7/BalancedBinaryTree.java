package ygy.test.week7;

/**
 * Created by guoyao on 2017/10/15.
 */
public class BalancedBinaryTree {


    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(0);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        treeNode1.right = treeNode2;
        treeNode2.right=treeNode3;
        System.out.println(isBalanced(treeNode1));
    }

    /**
     * Given a binary tree, determine if it is height-balanced.
     */
    private static final int UNBALANCED = -99;

    //leetcode answer
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getHeight(root) != UNBALANCED;
    }

    private static int getHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if (l == UNBALANCED || r == UNBALANCED || Math.abs(l-r) > 1) {
            return UNBALANCED;
        }
        return 1 + Math.max(l,r);
    }
}
