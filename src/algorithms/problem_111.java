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
 * �Ӹ��ڵ㵽�����Ҷ�ӽڵ��·�����Ⱦ���������Ҫ�õ�����С���
 */
public class problem_111 {

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        //һ��Ҫ��Ҷ�ӽڵ㣡��
        if(root.left == null)
            return minDepth(root.right)+1;
        if(root.right == null)
            return minDepth(root.left)+1;

        return Math.min(minDepth(root.left) +1 , minDepth(root.right) +1);
    }



}
