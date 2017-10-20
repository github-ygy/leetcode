package ygy.test.week8;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by guoyao on 2017/10/20.
 */
public class MinimumDepthofBinaryTree {

    public static void main(String[] args) {


    }


    /**
     * Given a binary tree, find its minimum depth.
     * <p>
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     */
    //bfs
    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        PriorityQueue<TreeNode> minPriority=new PriorityQueue<>(
                (x, y) -> x.val > y.val ? 1 : -1
        );
        Queue<TreeNode> knowQueue=new LinkedList<>();

        root.val=1;
        knowQueue.add(root);
        while (!knowQueue.isEmpty()) {
            TreeNode existNode=knowQueue.poll();
            int deep=existNode.val;
            if (existNode.left != null) {
                existNode.left.val=deep + 1;
                knowQueue.add(existNode.left);
            }

            if (existNode.right != null) {
                existNode.right.val=deep + 1;
                knowQueue.add(existNode.right);
            }

            if (existNode.left == null && existNode.right == null) {
                minPriority.add(existNode);
            }
        }
        return minPriority.poll().val;
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