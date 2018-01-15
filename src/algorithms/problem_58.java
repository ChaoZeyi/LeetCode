package algorithms;

/**
 * Created by chaozeyi on 18/1/15.
 */

/**
 * Length of Last Word
 *
 *Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 Example:

 Input: "Hello World"
 Output: 5

 */

/**
 * 一开始看到这个题的时候，第一反应是根据空格对字符串进行切分，切分成字符串数组，然后计算数组最后一位的的长度
 * 在这里排除一个误区，并不是说你调用一个现有的函数，这个函数的花费的时间就是常数时间，并不是的
 * 所以不能为了方便而选用一个库中的函数，而不计较它的耗时
 */
public class problem_58 {

    public int lengthOfLastWord(String s) {
        int len = s.length();

        int i = len - 1;
        int count = 0;
        while(i >= 0 && s.charAt(i) == ' ')
            i--;
        while(i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

}
