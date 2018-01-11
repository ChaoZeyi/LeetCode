package algorithms;

/**
 * Created by chaozeyi on 18/1/11.
 */

/**
 * Add Strings
 *
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:

 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

/**
 * 不能直接使用字符串转整数方法，而且字符串长度可能达到5100，也不可能转成整数，用整数类型表示
 */
public class problem_415 {

    public String addStrings(String num1, String num2) {

        int len1 = num1.length();
        int len2 = num2.length();

        int len = Math.max(len1, len2);
        int add = 0;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < len; i++){
            int res1 = 0;
            int res2 = 0;

            if(i < len1)
                res1 = num1.charAt(len1-1-i)-'0';

            if(i < len2)
                res2 = num2.charAt(len2-1-i)-'0';


            int res = (res1+res2+add)%10;
            add = (res1+res2+add)/10;
            result.append(res);
        }


        if(add == 1){
            result.append(1);
        }

        return result.reverse().toString();
    }

}
