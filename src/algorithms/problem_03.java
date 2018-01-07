package algorithms;

import java.util.HashMap;

/**
 * @author ChaoZeyi
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class problem_03 {
    public static void main(String[] args)
    {
        //只需要返回长度
        int res = lengthOfLongestSubstring("pwwkew");
        System.out.println(res);
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] strs = s.toCharArray();
        int max_num = 0;
        for(int i = 0; i < strs.length; i++)
        {
            HashMap hashMap = new HashMap();
            int num = 0;
            for(int j = i; j < strs.length; j++)
            {

//                if(hashMap.isEmpty())
//                    hashMap.put(strs[j],j);
               // System.out.println(hashMap.containsKey(strs[j]));
                if(hashMap.containsKey(strs[j]))
                    break;
                else
                {
                    hashMap.put(strs[j],j);
                    num++;
                }
            }
            max_num = Math.max(max_num,num);
        }
        return  max_num;

    }
}
