package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path
 from the root node down to the nearest leaf node.
 */

/**
 * 从根节点到最近的叶子节点的路径长度就是我们需要得到的最小深度
 */
public class problem_111 {

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        //一定要到叶子节点！！
        if(root.left == null)
            return minDepth(root.right)+1;
        if(root.right == null)
            return minDepth(root.left)+1;

        return Math.min(minDepth(root.left) +1 , minDepth(root.right) +1);
    }



}
