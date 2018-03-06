package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChaoZeyi
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

/**
 * 设置两个指针，一头一尾，头固定，尾依次向后移动，判断是否存在重复字符，如果存在重复字符，则移动头指针的位置
 */
public class problem_03 {
    public static void main(String[] args)
    {
        //只需要返回长度
        int res = lengthOfLongestSubstring("tmmzuxt");
        System.out.println(res);
    }
    public static int lengthOfLongestSubstring(String s) {
        int head = 0;
        int tail = 0;
        int max = 0;

        Map<Character, Integer> existedNum = new HashMap<>();
        char[] chars = s.toCharArray();
        for(; tail < s.length();tail++){
            if(existedNum.containsKey(chars[tail])){
                head = Math.max(head, existedNum.get(chars[tail])+1);

            }
            existedNum.put(chars[tail], tail);
            max = Math.max(max, tail-head+1);


        }


        return  max;

    }
}
