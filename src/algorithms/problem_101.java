package algorithms;

/**
 * Created by chaozeyi on 18/1/18.
 */

/**
 *Symmetric Tree
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

 1
 / \
 2   2
 / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
 1
 / \
 2   2
 \   \
 3    3
 */

/**
 * 这道题可以参考100题，一个是判断是否相等，一个是判断是否是镜像树，处理方法都是一样的
 */
public class problem_101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val == q.val){
            return(helper(p.left, q.right) && helper(p.right, q.left));
        }else{
            return false;}
    }
}
