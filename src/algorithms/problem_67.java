package algorithms;

/**
 * Created by chaozeyi on 18/1/15.
 */

/**
 * Add Binary
 *
 * Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100".
 */

/**
 * 和两个整型字符串的相加类似，只不过是将十进制改为了二进制
 */
public class problem_67 {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        int len = Math.max(lenA, lenB);
        int add = 0;
        for(int i = 0; i < len; i++){
            int aVal = 0;
            if(i <= lenA - 1)
                aVal = a.charAt(lenA - 1 - i) - '0';
            int bVal = 0;
            if(i <= lenB - 1)
                bVal = b.charAt(lenB - 1 - i) - '0';
            int res = (aVal + bVal + add) % 2;
            add = (aVal + bVal + add) / 2;
            sb.append(res);
        }
        if(add == 1){
            sb.append(add);
        }
        return sb.reverse().toString();
    }


}
