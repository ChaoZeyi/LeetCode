package algorithms;


/**
 * Created by chaozeyi on 18/1/13.
 */

/**
 * Valid Anagram
 *
 *Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.
 */
public class problem_242 {

    //如果每个字符出现的次数一样，则返回true
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i : count){
            if(i != 0)
                return false;
        }
        return true;
    }

}
