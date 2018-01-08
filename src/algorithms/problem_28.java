package algorithms;

/**
 * Created by chaozeyi on 18/1/7.
 */

/**
 *Implement strStr()
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Example 1:

 Input: haystack = "hello", needle = "ll"
 Output: 2
 Example 2:

 Input: haystack = "aaaaa", needle = "bba"
 Output: -1
 */

import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * 找到子串第一次出现的索引，难点在于需要考虑到各种边界情况
 * ""，""   返回0
 * ""，"a"  返回－1
 * "a"，""  返回0
 *
 */
public class problem_28 {
    public int strStr(String haystack, String needle) {
        char[] haystack_char = haystack.toCharArray();
        char[] needle_char = needle.toCharArray();
        // 三种边界情况
        if(needle_char.length == 0)
            return 0;
        else if(haystack_char.length == 0)
            return -1;

        int j = 0;
        for(int i = 0; i< haystack_char.length; i++){
            if(haystack_char[i] == needle_char[j]){
                j++;
                if(j == needle_char.length){
                    return (i-j+1);
                }
                continue;
            }else{
                if(j == 0)
                    continue;
                else{
                    int temp = i - j;
                    i = temp;
                    j = 0;
                    continue;
                }

            }
        }
        return -1;

    }
}
