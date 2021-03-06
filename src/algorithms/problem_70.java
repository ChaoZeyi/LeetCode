package algorithms;

/**
 * Created by chaozeyi on 18/1/7.
 */

/**
 * Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 Note: Given n will be a positive integer.


 Example 1:

 Input: 2
 Output:  2
 Explanation:  There are two ways to climb to the top.

 1. 1 step + 1 step
 2. 2 steps
 Example 2:

 Input: 3
 Output:  3
 Explanation:  There are three ways to climb to the top.

 1. 1 step + 1 step + 1 step
 2. 1 step + 2 steps
 3. 2 steps + 1 step
 */

/**
 * 对于任意一步i，存在两种情况，
 * 从i－1步到i步走的是一个台阶，
 * 从i－1步到i步走的是两个个台阶，
 */
public class problem_70 {

    public static int climbStairs(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        //前一步走的是one step
        int one_step = 2;
        //前一步走的是two step
        int two_step = 1;

        int count = 0;

        for(int i = 3; i <= n; i++){
            count = one_step + two_step;
            two_step = one_step;
            one_step = count;

        }
        return count;


    }
}
