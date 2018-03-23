package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Given an integer (signed 32 bits),
 * write a function to check whether it is a power of 4.
 *
 * Follow up: Could you solve it without loops/recursion?
 */

/**
 * 一道技巧题，需要判断的是给定的整数是否为4的指数，可以通过二进制数来观察规律
 *
 * 4的指数的整数，二进制的第一位肯定为1，其他均为0，并且长度肯定是奇数。
 * 比如4：100， 16:10000
 */
public class problem_342 {

    public boolean isPowerOfFour(int num) {
        String binary = Integer.toBinaryString(num);
        if(binary.charAt(0) == '1' && binary.length()%2 == 1)
        {
            for(int i = 1; i < binary.length(); i++)
                if(binary.charAt(i) != '0')
                    return false;

            return true;
        }

        return false;




    }

}
