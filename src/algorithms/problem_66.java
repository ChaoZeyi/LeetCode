package algorithms;
import java.lang.Math;

/**
 * Created by chaozeyi on 18/1/6.
 */

/**
 * Plus One
 *
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.
 */

/**
 * 这道题比较难理解，意思就是说，有一个整数数组［1，2，3，4］，代表着整数1234，
 * 将该整数加1，得到1235，返回对应的整数数组［1，2，3，5］
 */
public class problem_66 {

    public static void main(String[] args){
        int[] a = new int[1];
        a[0] = 9;

        plusOne(a);
    }

    public static int[] plusOne(int[] digits) {

        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }else{

            int add = 1;
            for(int i = digits.length - 1; i >= 0; i--){
                int val = digits[i] + add;
                if(val == 10){
                    add = 1;
                    digits[i] = 0;
                }else{
                    add = 0;
                    digits[i] = val;
                }
            }
            // 说明最高位有了进位，此时数组长度加1
            if(digits[0] == 0){
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for(int i = 0; i < digits.length; i++){
                    result[i+1] = digits[i];
                }
                return result;
            }
        }
        return digits;


    }

}
