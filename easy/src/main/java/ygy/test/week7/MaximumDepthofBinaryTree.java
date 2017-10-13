package ygy.test.week7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by guoyao on 2017/10/13.
 */
public class MaximumDepthofBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);
        TreeNode treeNode5=new TreeNode(5);
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode3.left=treeNode4;
        treeNode2.right=treeNode5;
        System.out.println(maxDepth(treeNode1));
    }


    /**
     * Given a binary tree, find its maximum depth.
     The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */
    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int leftsum  = 1 ;
        int rightsum  = 1 ;
        leftsum+= maxDepth(root.left);     //计算左边的深度
        rightsum+= maxDepth((root.right));  //计算右边的深度
        return Math.max(leftsum, rightsum);  //取最大深度
    }


    //leetcode  bfs 广度优先搜素
    public int maxDepth_bfs(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();    //将临节点全部取出
            while(size-- > 0) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;
    }

    //leetcode  深度优先
    public int maxDepth_dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int max = 0;
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);
            if(node.left != null) {
                stack.push(node.left);
                value.push(temp+1);
            }
            if(node.right != null) {
                stack.push(node.right);
                value.push(temp+1);
            }
        }
        return max;
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