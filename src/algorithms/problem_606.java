package algorithms;

/**
 * Created by chaozeyi on 18/1/13.
 */

/**
 *Construct String from Binary Tree
 *
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

 The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.

 Example 1:
 Input: Binary tree: [1,2,3,4]
 1
 /   \
 2     3
 /
 4

 Output: "1(2(4))(3)"

 Explanation: Originallay it needs to be "1(2(4)())(3()())",
 but you need to omit all the unnecessary empty parenthesis pairs.
 And it will be "1(2(4))(3)".
 Example 2:
 Input: Binary tree: [1,2,3,null,4]
 1
 /   \
 2     3
 \
 4

 Output: "1(2()(4))(3)"
 */

/**
 * 相当于是二叉树的先序遍历
 */
class TreeNode {
    int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class problem_606 {
    public String tree2str(TreeNode t) {


        StringBuilder sb = new StringBuilder();

        helper(t, sb);
        return sb.toString();


    }
    public void helper(TreeNode t, StringBuilder sb){
        if(t == null)
            return ;
        sb.append(t.val);
        if(t.left == null && t.right == null)
            return;

        sb.append("(");
        helper(t.left,sb);
        sb.append(")");
        if(t.right != null)
        {
            sb.append("(");
            helper(t.right,sb);
            sb.append(")");
        }

    }
}
