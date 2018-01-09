package algorithms;

/**
 * Created by chaozeyi on 18/1/9.
 */

/**
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

 Example 1:
 Input: "aba"
 Output: True
 Example 2:
 Input: "abca"
 Output: True
 Explanation: You could delete the character 'c'.
 Note:
 The string will only contain lowercase characters a-z. The maximum length of the string is 50000.

 */

/**
 * 判断是否是回文数，和普通的不一样的是，它允许删除一个字符，
 *
 * 思路还是一样，声明首尾两个位置标识，一个往后移动，一个往前移动，当相遇时停止循环，
 *
 * 碰到不相等时，有一个跳过的机会，要么前指针不动，后指针前移，要么后指针不动，前指针后移，
 *
 * 但这两种是一个并列的情况，不存在先后关系，不能先1后2，或者先2后1
 *
 */
public class problem_680 {

    public boolean validPalindrome(String s) {

        int len = s.length();
        byte[] bytes = s.getBytes();

        int p = 0;
        int b = len-1;

        while(p < b){
            if(bytes[p] == bytes[b]){
                p++;
                b--;
                continue;
            }else
            {
                int p_ = p+1;
                int b_ = b-1;
                return (isPalindrome(bytes, p_, b) || isPalindrome(bytes, p, b_));
            }
        }
        return true;
    }
    public boolean isPalindrome(byte[] bytes, int p, int b) {
        while(p < b) {
            if (bytes[p] == bytes[b]) {
                p++;
                b--;
                continue;
            } else
                return false;
        }
        return true;


    }
}
