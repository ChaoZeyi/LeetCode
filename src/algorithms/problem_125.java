package algorithms;

/**
 * Created by chaozeyi on 18/1/9.
 */

/**
 * Valid Palindrome
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 */

/**
 * 跟传统的判断回文数的区别在于，忽略了大小写、字符和空格
 * 只需要判断字母和数字
 * 所以需要添加判断条件，
 */
public class problem_125 {

    public static void main(String[] args){
        System.out.print(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int p = 0;
        int b = chars.length - 1;


        while(p < b){

            if(!Character.isLetterOrDigit(chars[p])){
                p++;
                continue;
            }
            if(!Character.isLetterOrDigit(chars[b])) {
                b--;
                continue;
            }

            if(Character.isUpperCase(chars[p])){
                chars[p] += 32;
            }

            if(Character.isUpperCase(chars[b])){
                chars[b] += 32;
            }


            if(chars[p] == chars[b]){
                p++;
                b--;
                continue;
            }else{
                    return false;
            }
        }
        return true;
    }


}
