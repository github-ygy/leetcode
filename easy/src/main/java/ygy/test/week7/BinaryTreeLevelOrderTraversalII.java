package ygy.test.week7;

import java.util.*;

/**
 * Created by guoyao on 2017/10/13.
 */
public class BinaryTreeLevelOrderTraversalII {

    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(3);
        TreeNode treeNode2=new TreeNode(9);
        TreeNode treeNode3=new TreeNode(7);
        TreeNode treeNode4=new TreeNode(20);
        TreeNode treeNode5=new TreeNode(15);
        treeNode1.right=treeNode4;
        treeNode1.left=treeNode2;
        treeNode4.left=treeNode5;
        treeNode4.right=treeNode3;
        System.out.println(levelOrderBottom(treeNode1));
    }


    /**
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its bottom-up level order traversal as:
     * [
     * [15,7],
     * [9,20],
     * [3]
     * ]
     */
    //使用广度优先算法
    public  static  List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resultList=new ArrayList<>();

        if (root == null) {
            return resultList;
        }
        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> childList=new ArrayList<>();
            int size=queue.size();   //下一子节点个数
            while (size-- > 0) {
                TreeNode nextChild=queue.poll();
                childList.add(nextChild.val);
                if (nextChild.left != null) {
                    queue.offer(nextChild.left);
                }
                if (nextChild.right != null) {
                    queue.offer(nextChild.right);
                }
            }
            resultList.add(childList);
        }
       Collections.reverse(resultList);
        return resultList;
    }


}




