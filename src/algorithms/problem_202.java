package algorithms;

/**
 * Created by chaozeyi on 18/1/7.
 */

/**
 * Happy Number
 *
 * Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 这道题的难点在于，如果判断何时终止循环
 *
 * 当递归出现循环时，说明项目此时会陷入死循环，应该停止
 * 比如说，在某次得到了res=5,几次递归之后，又回到了5，这种情况下，肯定就是死循环
 * 所以我们选择一个set集合来保存每次递归得到的res
 */
public class problem_202 {
    private Set set = new HashSet<Integer>();

    public boolean isHappy(int n) {
        int res = 0;
        while(n != 0){
            int temp = n % 10;
            n = n/10;
            res += Math.pow(temp, 2);
        }
        if(res == 1)
            return true;
        if(set.contains(res)){
            return false;
        }else {
            set.add(res);
            return isHappy(res);
        }


    }

}
