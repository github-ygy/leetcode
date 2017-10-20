package ygy.test.week8;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guoyao on 2017/10/20.
 */
public class PathSum {

    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(-2);
        TreeNode treeNode3=new TreeNode(-3);
        TreeNode treeNode4=new TreeNode(1);
        TreeNode treeNode5=new TreeNode(3);
        TreeNode treeNode6=new TreeNode(-2);
        TreeNode treeNode7=new TreeNode(-1);
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.left= treeNode4;
        treeNode2.right=treeNode5;
        treeNode3.left=treeNode6;
        treeNode4.left=treeNode7;
        System.out.println(hasPathSum(treeNode1,2));
    }

    /**
     * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

     For example:
     Given the below binary tree and sum = 22,
              5
            / \
           4   8
         /    / \
      11    13   4
      /  \       \
     7    2       1
     return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
     */

    public static boolean hasPathSum(TreeNode root, int sum) {

        if(root == null ) return false;
        Queue<TreeNode> knowQueue=new LinkedList<>();

        knowQueue.add(root);
        while (!knowQueue.isEmpty()) {
            TreeNode existNode=knowQueue.poll();
            int path = existNode.val;
            if (existNode.left != null) {
                existNode.left.val+=path;
                knowQueue.add(existNode.left);
            }
            if (existNode.right != null) {
                existNode.right.val+=path;
                knowQueue.add(existNode.right);
            }

            if (existNode.left == null && existNode.right == null && existNode.val == sum ) {
                return true ;
            }
        }
        return false;
    }
}
