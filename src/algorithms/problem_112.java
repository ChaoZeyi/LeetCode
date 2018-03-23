package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

 For example:
 Given the below binary tree and sum = 22,

 5
 / \
 4   8
 /   / \
 11  13  4
 /  \      \
 7    2      1
 return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */

/**
 * 只需要判断是否存在这一路径，不需要输出路径
 */
public class problem_112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        //需要注意最后一个数一定得是叶节点
        if(root.left == null && root.right == null)
            return sum == root.val;
        return (hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val));


    }

}
